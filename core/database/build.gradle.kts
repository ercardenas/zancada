plugins {
    alias(libs.plugins.zancada.android.library)
}

android {
    namespace = "com.zancada.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}