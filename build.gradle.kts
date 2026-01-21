// This top-level plugins block replaces the old `buildscript` block.
plugins {
    // This plugin is required for building Android applications.
    id("com.android.application") version "8.13.1" apply false

    // This plugin is required for all Kotlin code in Android projects.
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("com.google.gms.google-services") version "4.4.4" apply false
    // The KSP plugin is needed for Room database compilation.
    id("com.google.devtools.ksp") version "2.0.0-1.0.21" apply false

    // This is the new, required plugin for Compose compatibility.
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false
}
//
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // existing classpaths...
        classpath ("com.google.gms:google-services:4.4.4") // add this if missing
    }
}

