plugins {
    alias(libs.plugins.briefing.android.library)
    alias(libs.plugins.briefing.android.feature)
}

android {
    namespace = "store.newsbriefing.app.feature.home"
}

dependencies {
    api(projects.core.model)
    api(projects.core.common)
    api(projects.core.designsystem)
}