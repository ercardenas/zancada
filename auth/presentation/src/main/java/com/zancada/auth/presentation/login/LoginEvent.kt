package com.zancada.auth.presentation.login

import com.zancada.core.presentation.ui.UiText

sealed interface LoginEvent {
    data class Error(val error: UiText): LoginEvent
    data object LoginSuccess : LoginEvent
}