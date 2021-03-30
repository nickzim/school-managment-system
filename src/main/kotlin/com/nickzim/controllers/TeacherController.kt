package com.nickzim.controllers

import com.nickzim.domain.Subject
import com.nickzim.domain.Teacher
import com.nickzim.services.contracts.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/teachers")
class TeacherController @Autowired constructor(
    val service: TeacherService
){

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    fun addTeacher(@RequestBody teacher: Teacher){
        service.addTeacher(teacher)
    }

    @GetMapping("/all")
    fun getAllTeachers(): List<Teacher>{
        return service.getAllTeachers()
    }

}