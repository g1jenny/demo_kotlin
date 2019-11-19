package com.example.demo_kotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class SampleClass {

    @RequestMapping("/")
    fun index(): String {
        return "index"
    }
}
