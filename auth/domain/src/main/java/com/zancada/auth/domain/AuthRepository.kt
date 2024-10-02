package com.zancada.auth.domain

import com.zancada.core.domain.util.DataError
import com.zancada.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun login(email: String, password: String): EmptyResult<DataError.Network>
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}