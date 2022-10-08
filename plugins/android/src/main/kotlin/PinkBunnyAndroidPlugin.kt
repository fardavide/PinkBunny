
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply

@Suppress("unused")
abstract class PinkBunnyAndroidPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        PinkBunnyAndroidExtension.setup(target)
        target.setupAndroidPlugin()
    }
}

private fun Project.setupAndroidPlugin() {
    if (findMultiplatformExtension() == null) {
        apply(plugin = "org.jetbrains.kotlin.android")
    }
    if (isApp()) {
        apply(plugin = "com.android.application")
        // TODO apply(plugin = "com.google.gms.google-services")
        apply(plugin = "com.google.firebase.crashlytics")
    } else {
        apply(plugin = "com.android.library")
    }
    apply<PinkBunnyKotlinPlugin>()

    configureTestedExtension()
}

private fun Project.isApp() = "app" in name
