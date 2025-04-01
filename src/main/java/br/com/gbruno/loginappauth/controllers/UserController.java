package br.com.gbruno.loginappauth.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 @RequestMapping("/users")
public class UserController {

    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("Sucess");
    }
}
