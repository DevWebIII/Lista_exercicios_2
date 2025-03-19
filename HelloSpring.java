package br.edu.ifpr.foz.projeto_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hello")
public class HelloSpring {
    
    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return ("Olá Mundo!");
    }
}
