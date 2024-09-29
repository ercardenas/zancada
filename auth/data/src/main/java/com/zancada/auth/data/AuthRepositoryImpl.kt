package com.zancada.auth.data

import com.zancada.auth.domain.AuthRepository
import com.zancada.core.data.networking.post
import com.zancada.core.domain.util.DataError
import com.zancada.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class AuthRepositoryImpl(
    private val httpClient: HttpClient
) : AuthRepository {
    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}