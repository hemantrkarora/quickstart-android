plugins {
    id("java-library")
    id("kotlin")
}

java {
    targetCompatibility = JavaVersion.VERSION_17
    sourceCompatibility = JavaVersion.VERSION_17
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}

dependencies {
    compileOnly("com.android.tools.lint:lint-api:32.3.1")
    testImplementation("com.android.tools.lint:lint:32.3.1")
    testImplementation("com.android.tools.lint:lint-tests:32.3.1")
    testImplementation("junit:junit:4.13.2")
}
