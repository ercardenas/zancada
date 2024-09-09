plugins {
    alias(libs.plugins.zancada.android.library)
    alias(libs.plugins.zancada.jvm.ktor)
}

android {
    namespace = "com.zancada.auth.data"
}

dependencies {
    implementation(libs.bundles.koin)
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}