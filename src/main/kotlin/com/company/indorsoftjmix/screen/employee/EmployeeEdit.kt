package com.company.indorsoftjmix.screen.employee

import io.jmix.ui.screen.*
import com.company.indorsoftjmix.entity.Employee

@UiController("Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
class EmployeeEdit : StandardEditor<Employee>()