package com.example.carmanagerpro.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.carmanagerpro.domain.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val repository: AuthRepository
): ViewModel() {

    var email = mutableStateOf("")
    var password = mutableStateOf("")

    private val _isLoading = mutableStateOf(false)
    val isLoading: State<Boolean> = _isLoading

    private val _error = mutableStateOf<String?>(null)
    val error: State<String?> = _error

    fun onLoginClick(onSuccess: () -> Unit) {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null
            val result = repository.loginWithEmail(email.value, password.value)
            _isLoading.value = false

            result.onSuccess { onSuccess() }
            result.onFailure { _error.value = it.localizedMessage ?: "Ошибка входа" }
        }
    }

    fun onRegisterClick(onSuccess: () -> Unit) {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null
            val result = repository.registerWithEmail(email.value, password.value)
            _isLoading.value = false

            result.onSuccess { onSuccess() }
            result.onFailure { _error.value = it.localizedMessage ?: "Ошибка регистрации" }
        }
    }

}