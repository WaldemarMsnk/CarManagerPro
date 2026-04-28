package com.example.carmanagerpro.data.mapper

import com.example.carmanagerpro.data.local.entities.VehicleEntity
import com.example.carmanagerpro.domain.model.BrandingType
import com.example.carmanagerpro.domain.model.FuelType
import com.example.carmanagerpro.domain.model.TransmissionType
import com.example.carmanagerpro.domain.model.Vehicle

fun VehicleEntity.toDomain(): Vehicle = Vehicle(
    id = id,
    brand = brand,
    model = model,
    year = year,
    licensePlate = licensePlate,
    vin = vin,
    odometerValue = odometerValue,
    fuelType = FuelType.valueOf(fuelType),
    enginePower = enginePower,
    engineVolume = engineVolume,
    brandingType = BrandingType.valueOf(brandingType),
    transmissionType = TransmissionType.valueOf(transmissionType)
)

fun Vehicle.toEntity(): VehicleEntity = VehicleEntity(
    id = id,
    brand = brand,
    model = model,
    year = year,
    licensePlate = licensePlate,
    vin = vin,
    odometerValue = odometerValue,
    fuelType = fuelType.name,
    enginePower = enginePower,
    engineVolume = engineVolume,
    brandingType = brandingType.name,
    transmissionType = transmissionType.name
)