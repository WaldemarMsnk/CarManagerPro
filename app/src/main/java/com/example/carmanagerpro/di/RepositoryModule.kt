package com.example.carmanagerpro.di

import com.example.carmanagerpro.data.repository.VehicleRepositoryImpl
import com.example.carmanagerpro.domain.repository.AuthRepository
import com.example.carmanagerpro.domain.repository.AuthRepositoryImpl
import com.example.carmanagerpro.domain.repository.VehicleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindVehicleRepository(
        vehicleRepositoryImpl: VehicleRepositoryImpl
    ): VehicleRepository

    @Binds
    @Singleton
    abstract fun bindAuthRepository(
        authRepositoryImpl: AuthRepositoryImpl
    ): AuthRepository

}
