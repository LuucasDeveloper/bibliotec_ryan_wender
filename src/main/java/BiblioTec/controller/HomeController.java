package BiblioTec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // TODO: receba a rota raiz e devolva o nome da sua view
    @GetMapping("/")
    public String home(){
        return "index";
    }

}