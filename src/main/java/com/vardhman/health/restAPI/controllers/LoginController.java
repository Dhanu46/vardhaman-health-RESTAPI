package com.vardhman.health.restAPI.controllers;

import com.vardhman.health.restAPI.dto.LoginDTO;
import com.vardhman.health.restAPI.services.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/login")
@AllArgsConstructor
public class LoginController {

    private final LoginService loginService;

@PostMapping
    public ResponseEntity<String> authenticate(@Valid @RequestBody LoginDTO loginDTO){
    return loginService.authenticate(loginDTO);
}


}
