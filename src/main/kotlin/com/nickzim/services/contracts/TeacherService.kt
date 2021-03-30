package com.nickzim.services.contracts

import com.nickzim.domain.Teacher

interface TeacherService {

    fun getAllTeachers() : MutableList<Teacher>

    fun addTeacher(teacher: Teacher)


}