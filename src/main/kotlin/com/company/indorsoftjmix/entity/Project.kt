package com.company.indorsoftjmix.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import io.jmix.data.impl.lazyloading.NotInstantiatedList
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Table(name = "PROJECT")
@Entity
open class Project {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    var name: String? = null

    @JoinTable(
        name = "PROJECT_EMPLOYEE_LINK",
        joinColumns = [JoinColumn(name = "PROJECT_ID")],
        inverseJoinColumns = [JoinColumn(name = "EMPLOYEE_ID")]
    )
    @ManyToMany
    var employees: MutableList<Employee> = NotInstantiatedList()
}