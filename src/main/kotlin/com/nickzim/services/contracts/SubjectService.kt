package com.nickzim.services.contracts

import com.nickzim.domain.Subject

interface SubjectService {

    fun addSubject(subject: Subject)

    fun getAllSubjects() : MutableList<Subject>

}