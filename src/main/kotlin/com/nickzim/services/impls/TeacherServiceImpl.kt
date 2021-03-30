package com.nickzim.services.impls

import com.nickzim.domain.Subject
import com.nickzim.domain.Teacher
import com.nickzim.repositories.SubjectRepository
import com.nickzim.repositories.TeacherRepository
import com.nickzim.services.contracts.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class TeacherServiceImpl @Autowired constructor(
    private val teacherRepository: TeacherRepository
): TeacherService {

    override fun getAllTeachers(): MutableList<Teacher> {
        return teacherRepository.findAll()
    }

    override fun addTeacher(teacher: Teacher) {
        teacherRepository.save(teacher)
    }


}