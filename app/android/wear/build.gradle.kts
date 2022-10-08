plugins {
    id("pinkbunny.android")
}

pinkBunnyAndroid {
    val version = System.getenv()["APP_VERSION"] ?: "1"
    useCompose()
    androidApp(
        id = "studio.forface.pinkbunny.wear",
        versionCode = version.toInt(),
        versionName = version
    )
}

moduleDependencies {
    design.android {
        this()
        wear()
    }
}

dependencies {

    implementation(platform(libs.firebase.bom))

    implementation(libs.bundles.base)
    implementation(libs.bundles.compose.common)
    implementation(libs.bundles.compose.wear)

    implementation(libs.androidx.activity)
    implementation(libs.androidx.ktx)
    implementation(libs.androidx.lifecycle.runtime)
    implementation(libs.androidx.lifecycle.viewModel)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.firebase.crashlytics)
    implementation(libs.kermit.crashlytics)
    implementation(libs.koin.android)

    debugImplementation(libs.compose.uiTest.manifest)
    debugImplementation(libs.compose.uiTooling)

    testImplementation(libs.bundles.test.kotlin)
    testImplementation(libs.koin.test)
    androidTestImplementation(libs.bundles.test.android)
    androidTestImplementation(libs.compose.uiTest)
    androidTestImplementation(libs.koin.test)
}
