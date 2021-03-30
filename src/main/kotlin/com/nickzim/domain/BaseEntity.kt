package com.nickzim.domain

import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.fasterxml.jackson.annotation.ObjectIdGenerators
import java.io.Serializable
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator::class, property = "id")
class BaseEntity<T : Serializable> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: T? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BaseEntity<*>

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return 27
    }

    override fun toString(): String {
        return "BaseEntity(id=$id)"
    }


}