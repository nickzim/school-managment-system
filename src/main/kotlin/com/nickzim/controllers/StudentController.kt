package com.nickzim.controllers

import com.nickzim.domain.Student
import com.nickzim.services.contracts.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController @Autowired constructor(
    val service: StudentService
){

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    fun addStudent(@RequestBody student: Student){
        service.addStudent(student)
    }

    @GetMapping("/all")
    fun getAllStudents(): List<Student>{
        return service.getAllStudents()
    }
}