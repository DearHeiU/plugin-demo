package com.github.dearheiu.plugindemo.services

import com.intellij.openapi.project.Project
import com.github.dearheiu.plugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
