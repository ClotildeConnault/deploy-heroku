package be.technifutur.deploy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(path = "/coucou")
public class CoucouController {

    @GetMapping
    public String coucou() {
        return "Bonjour les amis accros du café";
    }
}
