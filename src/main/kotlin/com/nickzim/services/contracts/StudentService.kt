package com.nickzim.services.contracts

import com.nickzim.domain.Student

interface StudentService {

    fun addStudent(student: Student)

    fun getAllStudents() : MutableList<Student>
}