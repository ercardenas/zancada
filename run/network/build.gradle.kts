plugins {
    alias(libs.plugins.zancada.android.library)
}

android {
    namespace = "com.zancada.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}