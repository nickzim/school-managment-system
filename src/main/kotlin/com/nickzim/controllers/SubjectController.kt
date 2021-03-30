package com.nickzim.controllers

import com.nickzim.domain.Subject
import com.nickzim.services.contracts.SubjectService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/subjects")
class SubjectController @Autowired constructor(
    val service: SubjectService
) {

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    fun addSubject(@RequestBody subject: Subject){
        service.addSubject(subject)
    }

    @GetMapping("/all")
    fun getAllSubjects() : List<Subject>{
        return service.getAllSubjects()
    }
    

}