plugins {
    alias(libs.plugins.zancada.android.library)
//    alias(libs.plugins.zancada.android.room)
}

android {
    namespace = "com.zancada.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}