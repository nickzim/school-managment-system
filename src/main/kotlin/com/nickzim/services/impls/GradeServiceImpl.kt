package com.nickzim.services.impls

import com.nickzim.domain.Grade
import com.nickzim.repositories.GradeRepository
import com.nickzim.services.contracts.GradeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GradeServiceImpl @Autowired constructor(
    private val repository: GradeRepository
): GradeService {

    override fun getAllGrades(): MutableList<Grade> {
        return repository.findAll()
    }

    override fun addGrade(grade: Grade) {
        repository.save(grade)

    }
}