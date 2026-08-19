plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.cloudstream)
}

android {
    namespace = "com.blvietsub"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }
}

cloudstream {
    repoUrl = "https://github.com/HTVC579/BL"
}
 
