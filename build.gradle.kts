import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.50" apply false
}

allprojects {
    group = "gradle-multimodule-demo"
    version = "0.1.0"
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    
    repositories {
        jcenter()
    }

    dependencies {
        val implementation by configurations
        val testImplementation by configurations

        implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

        testImplementation("org.jetbrains.kotlin:kotlin-test")
        testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    }

    tasks {
        named("compileKotlin", KotlinCompile::class) {
            kotlinOptions {
                allWarningsAsErrors = false
            }
        }
    }

}
