package com.nickzim.domain

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "teachers")
class Teacher(

    @Column(name = "name")
    val name: String = "",

    @Column(name = "birthday")
    val birthdayDate: Date? = null,

    @Column(name = "experience")
    val experience: Int = 0,

    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(name = "teachers_subjects", joinColumns = [JoinColumn(name = "teacher_id")], inverseJoinColumns = [JoinColumn(name = "subject_id")])
    val subjects: MutableList<Subject?> = mutableListOf()

) : BaseEntity<Long>()

