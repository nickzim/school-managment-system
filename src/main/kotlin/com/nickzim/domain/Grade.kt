package com.nickzim.domain

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name = "grades")
class Grade(

    @Column(name = "name")
    val name: String = "",

    @OneToOne
    @JoinColumn(table = "teachers", name = "id")
    val formMasterId: Teacher? = null,

    @OneToMany(mappedBy = "gradeId",cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JsonBackReference
    val students: List<Student> = emptyList()


) : BaseEntity<Long>()
