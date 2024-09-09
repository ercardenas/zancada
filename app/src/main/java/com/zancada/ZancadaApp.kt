package com.zancada

import android.app.Application
import com.zancada.auth.data.di.authDataModule
import com.zancada.auth.presentation.di.authViewModelModule
import com.zancada.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class ZancadaApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
             Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@ZancadaApp)
            modules(
                appModule,
                authDataModule,
                authViewModelModule
            )
        }
    }
}