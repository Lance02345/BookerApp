package com.lance.Booker.controllers

import com.lance.Booker.entities.User
import com.lance.Booker.repository.UserRepo
import com.lance.Booker.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.expression.spel.ast.ValueRef
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
class MainController {
    @Autowired
    lateinit var userService: UserService

    @RequestMapping(value = ["/get-users"], method = [RequestMethod.GET])
    fun getUsers(): List<User> {
        return userService.getUsers()
    }

    @RequestMapping(value = ["/add-user"], method = [RequestMethod.POST])
    fun addStudent(@RequestBody user: User): String {
        return userService.addStudent(user)
    }

    @RequestMapping(value = ["/delete-user"], method = [RequestMethod.DELETE])
    fun deleteStudent(@RequestParam id: BigDecimal): String {
        return userService.deleteUser(id)
    }
}