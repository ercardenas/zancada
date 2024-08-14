plugins {
    alias(libs.plugins.zancada.android.feature.ui)
}

android {
    namespace = "com.zancada.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}