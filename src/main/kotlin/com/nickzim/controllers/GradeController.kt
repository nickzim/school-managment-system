package com.nickzim.controllers

import com.nickzim.domain.Grade
import com.nickzim.services.contracts.GradeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/classes")
class GradeController @Autowired constructor(
    val service: GradeService
) {

    @GetMapping("/all")
    fun getAllClasses() : List<Grade>{
        return service.getAllGrades()
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    fun addClass(@RequestBody grade: Grade){
        service.addGrade(grade)
    }
}