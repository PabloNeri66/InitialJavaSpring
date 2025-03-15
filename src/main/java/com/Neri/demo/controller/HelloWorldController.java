package com.Neri.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")



// STATEFUL --> O estado do cliente é mantido : STATELESS --> (Token) A cada nova requisicao preciso enviar dados e informacoes ( mais escalavel )
public class HelloWorldController {
    @GetMapping("/get")
    public String helloworld()
    {
        return "hello World";
    }
}
