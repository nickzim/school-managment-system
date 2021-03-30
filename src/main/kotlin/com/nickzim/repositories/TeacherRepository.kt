package com.nickzim.repositories

import com.nickzim.domain.Teacher
import org.springframework.data.jpa.repository.JpaRepository

interface TeacherRepository: JpaRepository<Teacher,Long>