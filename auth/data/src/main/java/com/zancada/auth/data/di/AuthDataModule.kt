package com.zancada.auth.data.di

import com.zancada.auth.data.EmailPatternValidator
import com.zancada.auth.domain.PatternValidator
import com.zancada.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
}