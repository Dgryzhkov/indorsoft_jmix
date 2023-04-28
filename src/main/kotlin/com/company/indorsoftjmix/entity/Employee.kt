package com.company.indorsoftjmix.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import io.jmix.data.impl.lazyloading.NotInstantiatedList
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Table(name = "EMPLOYEE")
@Entity
open class Employee {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @InstanceName
    @Column(name = "FULL_NAME", nullable = false)
    @NotNull
    var fullName: String? = null

    @JoinTable(
        name = "PROJECT_EMPLOYEE_LINK",
        joinColumns = [JoinColumn(name = "EMPLOYEE_ID")],
        inverseJoinColumns = [JoinColumn(name = "PROJECT_ID")]
    )
    @ManyToMany
    var projects: MutableList<Project> = NotInstantiatedList()
}