package com.gobeyond.jwt.token.repository

import com.gobeyond.jwt.token.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, String> {
    fun findByEmail(email: String): User
}
