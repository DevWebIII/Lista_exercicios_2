package br.edu.ifpr.foz.projeto_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;



@Controller
@RequestMapping("")
public class RequestController {
    
    @GetMapping("/requisicao")
    @ResponseBody
    public String getRequest(HttpServletRequest request){
       String requisicao = request.getMethod() + "  " + request.getRequestURI() + "  " + request.getProtocol();

       return requisicao;
    }
}
