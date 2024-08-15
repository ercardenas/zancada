plugins {
    alias(libs.plugins.zancada.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}