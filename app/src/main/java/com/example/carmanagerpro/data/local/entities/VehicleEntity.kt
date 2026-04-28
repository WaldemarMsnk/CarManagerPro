package com.example.carmanagerpro.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vehicles")
data class VehicleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val brand: String,
    val model: String,
    val year: Int,
    val licensePlate: String,
    val vin: String,
    val odometerValue: Int,
    val fuelType: String,
    val enginePower: Int,
    val engineVolume: Double,
    val brandingType: String,
    val transmissionType: String
    )