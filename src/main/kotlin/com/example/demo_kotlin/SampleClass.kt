package com.example.demo_kotlin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

class SampleClass {

    @GetMapping("/")
    fun sampleHome(): String {

        return "hello world with kotlin"
    }

}