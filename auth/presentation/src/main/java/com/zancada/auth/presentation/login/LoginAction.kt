package com.zancada.auth.presentation.login

sealed interface LoginAction {
    data object OnToggledPasswordVisibility : LoginAction
    data object OnLoginClick : LoginAction
    data object OnRegisterClick : LoginAction
}