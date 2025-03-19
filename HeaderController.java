package br.edu.ifpr.foz.projeto_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/header")
public class HeaderController {

    @GetMapping("/cabecalho")
    @ResponseBody
    public String header(HttpServletRequest request){
        String headers = "Host: " + request.getHeader("Host") + "<br>" + 
                             "User-Agent: " + request.getHeader("User-Agent") + "<br>" + 
                             "Accept-Encoding: " + request.getHeader("Accept-Encoding") + "<br>" +
                             "Accept-Language: " + request.getHeader("Accept-Language");

        return headers;
    }
}
