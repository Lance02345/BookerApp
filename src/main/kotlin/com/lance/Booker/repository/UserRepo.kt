package com.lance.Booker.repository

import com.lance.Booker.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal

@Repository
interface UserRepo :JpaRepository<User,BigDecimal>{

}