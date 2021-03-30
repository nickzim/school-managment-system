package com.nickzim.domain

import javax.persistence.*

@Entity
@Table(name = "subjects")
class Subject(

    @Column(name = "name")
    val name: String = "",

    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(name = "teachers_subjects", joinColumns = [JoinColumn(name = "subject_id") ], inverseJoinColumns = [JoinColumn(name = "teacher_id")])
    val teachers: MutableList<Teacher?> = mutableListOf()

) : BaseEntity<Long>()
