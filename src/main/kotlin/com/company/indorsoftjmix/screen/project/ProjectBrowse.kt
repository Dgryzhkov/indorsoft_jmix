package com.company.indorsoftjmix.screen.project

import io.jmix.ui.screen.*
import com.company.indorsoftjmix.entity.Project

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
class ProjectBrowse : StandardLookup<Project>()