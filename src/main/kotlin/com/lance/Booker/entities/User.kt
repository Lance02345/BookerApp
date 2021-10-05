package com.lance.Booker.entities

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Userss")
class User {
    @Id
    @Column
    var id: BigDecimal? = null

    var first_NAME: String? = null

    var last_NAME: String? = null

    var email_ADDRESS: String? = null

    var username: String? = null

    var password: String? = null
}