plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin)
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("plugin") {
            id = "pinkbunny.kotlin"
            displayName = "PinkBunny Kotlin"
            description = "Configure Kotlin module"
            implementationClass = "PinkBunnyKotlinPlugin"
        }
    }
}

dependencies {

    implementation(libs.gradle.kotlin)
}
