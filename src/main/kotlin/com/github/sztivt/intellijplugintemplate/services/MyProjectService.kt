package com.github.sztivt.intellijplugintemplate.services

import com.github.sztivt.intellijplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
