package com.nickzim.repositories

import com.nickzim.domain.Grade
import org.springframework.data.jpa.repository.JpaRepository

interface GradeRepository: JpaRepository<Grade, Long>