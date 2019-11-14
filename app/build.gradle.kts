plugins {
    application
}


dependencies {
    implementation(project(":core"))
}

application {
    mainClassName = "org.hshekhar.AppKt"
}
