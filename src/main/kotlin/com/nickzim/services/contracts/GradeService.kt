package com.nickzim.services.contracts

import com.nickzim.domain.Grade

interface GradeService {

    fun getAllGrades() : MutableList<Grade>

    fun addGrade(grade: Grade)
}