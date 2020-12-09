package io.soffa.sample.samplebackend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun index() = mapOf("message" to "Hello world")

}