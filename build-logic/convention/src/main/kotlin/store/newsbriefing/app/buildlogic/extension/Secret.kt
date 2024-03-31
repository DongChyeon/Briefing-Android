package store.newsbriefing.app.buildlogic.extension

import com.google.android.libraries.mapsplatform.secrets_gradle_plugin.SecretsPluginExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

internal fun Project.configureSecret() {
    extensions.configure<SecretsPluginExtension> {
        defaultPropertiesFileName = "secrets.properties"
    }
}