package com.nickzim.domain

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name = "students")
class Student(

    @Column(name = "name")
    val name: String = "",

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grade_id")
    @JsonManagedReference
    val gradeId: Grade? = null

) : BaseEntity<Long>()
