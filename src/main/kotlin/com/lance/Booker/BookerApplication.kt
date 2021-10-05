package com.lance.Booker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookerApplication

fun main(args: Array<String>) {
	runApplication<BookerApplication>(*args)
}
