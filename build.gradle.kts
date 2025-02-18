plugins {
    id("org.gradle.presentation.asciidoctor")
}

presentation {
    githubUserName.set("britter")
    githubRepoName.set("kotlin-everywhere-2019-cologne")
}

dependencies {
    asciidoctor("org.asciidoctor:asciidoctorj-diagram:1.5.11")
}

tasks {
    asciidoctor {
        requires("asciidoctor-diagram")
    }
}