package dev.gk51.home;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements ErrorController {

    @GetMapping("/error")
    public void errorGET() {

    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
