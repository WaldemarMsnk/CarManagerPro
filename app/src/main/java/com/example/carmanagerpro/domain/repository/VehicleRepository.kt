package com.example.carmanagerpro.domain.repository

import com.example.carmanagerpro.domain.model.Vehicle
import kotlinx.coroutines.flow.Flow

interface VehicleRepository {
    fun getAllVehicles(): Flow<List<Vehicle>>

    suspend fun insertVehicle(vehicle: Vehicle)

    suspend fun deleteVehicle(vehicle: Vehicle)
}