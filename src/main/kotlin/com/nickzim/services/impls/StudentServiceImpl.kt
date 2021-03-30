package com.nickzim.services.impls

import com.nickzim.domain.Student
import com.nickzim.repositories.StudentRepository
import com.nickzim.services.contracts.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl @Autowired constructor(
    private val repository: StudentRepository
): StudentService {

    override fun addStudent(student: Student) {
        repository.save(student)
    }

    override fun getAllStudents(): MutableList<Student> {
        return repository.findAll()
    }
}