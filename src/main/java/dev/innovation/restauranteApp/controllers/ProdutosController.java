package dev.innovation.RestauranteApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/produto")
public class ProdutosController {

    @GetMapping
    public String dafault(){
        return "login";
    }
}
