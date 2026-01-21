// 1. PLUGIN MANAGEMENT
// This block tells Gradle where to find the plugins themselves (like the Android Gradle Plugin).
// In settings.gradle.kts (or the top-level build file)
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

// 2. DEPENDENCY RESOLUTION MANAGEMENT
// This block tells Gradle where to find the actual code libraries and dependencies
// used by your application modules (like AndroidX, Compose, Retrofit, etc.)
dependencyResolutionManagement {
    // Defines the dependency coordinate format (e.g., "com.example:library:1.0.0")
    // This is required for using the repositories block below.
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        // Essential for all AndroidX, Google Play services, and other Google-hosted libraries.
        google()
        // Essential for most third-party and community Java/Kotlin libraries.
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

// 3. PROJECT STRUCTURE
// Defines the name of the root project and includes all the modules that belong to it.
rootProject.name = "Employeetracker5" // Based on your project name from the screenshots
include(":app")
// If you add other modules (e.g., ":data", ":domain"), you must list them here.