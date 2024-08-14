plugins {
    alias(libs.plugins.zancada.android.library)
}

android {
    namespace = "com.zancada.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}