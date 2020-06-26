package com.gobeyond.jwt.token.repository

import com.gobeyond.jwt.token.model.Role
import org.springframework.data.repository.CrudRepository

interface RoleRepository : CrudRepository<Role, String>
