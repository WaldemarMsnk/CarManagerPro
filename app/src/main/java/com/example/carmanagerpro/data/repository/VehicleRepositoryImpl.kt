package com.example.carmanagerpro.data.repository

import com.example.carmanagerpro.data.mapper.toDomain
import com.example.carmanagerpro.data.mapper.toEntity
import com.example.carmanagerpro.data.local.dao.VehicleDao
import com.example.carmanagerpro.domain.model.Vehicle
import com.example.carmanagerpro.domain.repository.VehicleRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class VehicleRepositoryImpl @Inject constructor(
    private val dao: VehicleDao
) : VehicleRepository {

    override fun getAllVehicles(): Flow<List<Vehicle>> {
        return dao.getAllVehicles().map { entities ->
            entities.map { it.toDomain() }
        }
    }

    override suspend fun insertVehicle(vehicle: Vehicle) {
        dao.insertVehicle(vehicle.toEntity())
    }

    override suspend fun deleteVehicle(vehicle: Vehicle) {
        dao.deleteVehicle(vehicle.toEntity())
    }
}
