package com.zancada.core.data.di

import com.zancada.core.data.auth.EncryptedSessionStorage
import com.zancada.core.data.networking.HttpClientFactory
import com.zancada.core.domain.util.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}