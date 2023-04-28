package com.company.indorsoftjmix.screen.employee

import io.jmix.ui.screen.*
import com.company.indorsoftjmix.entity.Employee

@UiController("Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
class EmployeeBrowse : StandardLookup<Employee>()