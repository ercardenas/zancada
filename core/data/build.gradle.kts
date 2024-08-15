plugins {
    alias(libs.plugins.zancada.android.library)
    alias(libs.plugins.zancada.jvm.ktor)
}

android {
    namespace = "com.zancada.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}