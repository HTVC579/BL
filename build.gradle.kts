import com.lagradost.cloudstream3.gradle.CloudstreamExtension

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.blvietsub"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }
}

cloudstream {
    setRepoUrl("https://github.com/HTVC579/BL")
}
