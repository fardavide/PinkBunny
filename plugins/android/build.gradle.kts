
plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin)
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("plugin") {
            id = "pinkbunny.android"
            displayName = "PinkBunny Android"
            description = "Configure Android module"
            implementationClass = "PinkBunnyAndroidPlugin"
        }
    }
}

dependencies {

    implementation(project(":kotlin"))
    implementation(libs.gradle.android)
    implementation(libs.gradle.kotlin)
}
