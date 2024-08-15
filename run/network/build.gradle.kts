plugins {
    alias(libs.plugins.zancada.android.library)
    alias(libs.plugins.zancada.jvm.ktor)
}

android {
    namespace = "com.zancada.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}