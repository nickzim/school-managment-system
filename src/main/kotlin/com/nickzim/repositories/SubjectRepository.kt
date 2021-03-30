package com.nickzim.repositories

import com.nickzim.domain.Subject
import org.springframework.data.jpa.repository.JpaRepository

interface SubjectRepository: JpaRepository<Subject, Long>