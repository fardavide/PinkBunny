plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin)
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("plugin") {
            id = "pinkbunny.detekt"
            displayName = "PinkBunny Detekt"
            description = "Configure Detekt"
            implementationClass = "PinkBunnyDetektPlugin"
        }
    }
}

dependencies {

    implementation(libs.gradle.detekt)
}
