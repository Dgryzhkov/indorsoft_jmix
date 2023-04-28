package com.company.indorsoftjmix.screen.project

import com.company.indorsoftjmix.entity.Employee
import io.jmix.ui.screen.*
import com.company.indorsoftjmix.entity.Project
import io.jmix.ui.component.DataGrid
import io.jmix.ui.icon.Icons
import io.jmix.ui.icon.JmixIcon
import io.jmix.ui.model.CollectionPropertyContainer
import org.springframework.beans.factory.annotation.Autowired

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
class ProjectEdit : StandardEditor<Project>() {

    @Autowired
    private lateinit var employeesDc: CollectionPropertyContainer<Employee>

    @Install(to = "employeesTable.checkEmployees", subject = "columnGenerator")
    private fun employeesTableCheckEmployeesColumnGenerator(columnGeneratorEvent: DataGrid.ColumnGeneratorEvent<Employee>?): Icons.Icon? {
        return if (employeesDc.containsItem(columnGeneratorEvent?.item?.id)) JmixIcon.OK else null
    }
}