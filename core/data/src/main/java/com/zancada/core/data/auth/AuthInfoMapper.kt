package com.zancada.core.data.auth

import com.zancada.core.domain.util.AuthInfo

fun AuthInfo.toAuthInfoSerializable(): AuthInfoSerializable =
    AuthInfoSerializable(accessToken, refreshToken, userId)

fun AuthInfoSerializable.toAuthInfo(): AuthInfo =
    AuthInfo(accessToken, refreshToken, userId)
