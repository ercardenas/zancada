package com.zancada.auth.domain

interface PatternValidator {
    fun matches(value: String): Boolean
}