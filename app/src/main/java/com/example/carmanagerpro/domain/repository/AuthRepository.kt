package com.example.carmanagerpro.domain.repository

import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    val currentUser: FirebaseUser?

    fun authState(): Flow<FirebaseUser?>

    suspend fun loginWithEmail(email: String, password: String): Result<Unit>
    suspend fun registerWithEmail(email: String, password: String): Result<Unit>
    fun logout()
}