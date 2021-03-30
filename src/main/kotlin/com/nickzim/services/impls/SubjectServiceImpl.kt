package com.nickzim.services.impls

import com.nickzim.domain.Subject
import com.nickzim.repositories.SubjectRepository
import com.nickzim.services.contracts.SubjectService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SubjectServiceImpl @Autowired constructor(
    private val repository: SubjectRepository
): SubjectService {

    override fun addSubject(subject: Subject) {
        repository.save(subject)
    }

    override fun getAllSubjects(): MutableList<Subject> {
        return repository.findAll()
    }


}