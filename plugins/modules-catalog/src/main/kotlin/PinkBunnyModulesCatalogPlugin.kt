import org.gradle.api.Plugin
import org.gradle.api.Project

abstract class PinkBunnyModulesCatalogPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.subprojects.forEach(PinkBunnyModulesCatalogExtension::setup)
    }
}
