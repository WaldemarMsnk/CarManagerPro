package com.example.carmanagerpro.data.local.dao

import androidx.room.*
import com.example.carmanagerpro.data.local.entities.VehicleEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface VehicleDao {

    @Query("SELECT * FROM vehicles ORDER BY id DESC")
    fun getAllVehicles(): Flow<List<VehicleEntity>>

    @Query("SELECT * FROM vehicles WHERE id = :id")
    suspend fun getVehicleById(id: Long): VehicleEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertVehicle(vehicle: VehicleEntity)

    @Delete
    suspend fun deleteVehicle(vehicle: VehicleEntity)
}
