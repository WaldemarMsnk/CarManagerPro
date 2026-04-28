package com.example.carmanagerpro.domain.model

data class Vehicle(
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