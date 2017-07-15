package com.mrmo.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyGradlePlugin implements Plugin<Project> {

    void apply(Project project) {
        println("========================");
        println("hello gradle plugin!");
        println("========================");
    }
}
