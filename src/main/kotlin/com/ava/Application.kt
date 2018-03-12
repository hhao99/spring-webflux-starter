package com.ava

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.stereotype.Controller;


@SpringBootApplication
class Application

@Controller
class HomeController {
    @GetMapping("/" )
    fun Home(@RequestParam(name="name",required=false,defaultValue="World") name: String?, model: Model): String {
        model.addAttribute("name",name)
        return "index"
    }
}
fun main(args: Array<String>) {
    runApplication<Application>(*args)
}