package com.example.demo_kotlin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class SampleClass {

    @RequestMapping("/")
    @ResponseBody
    fun sampleHome(): String {
        return "run springboot app";
    }

    @RequestMapping("/hi")
    fun hi(): String {
        return "index"
    }
}

