package com.vardhman.health.restAPI.controllers;

import com.vardhman.health.restAPI.dto.RegistrationDTO;
import com.vardhman.health.restAPI.models.Registration;
import com.vardhman.health.restAPI.services.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/registration")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<Registration> addUser(@Valid @RequestBody RegistrationDTO registrationDTO){
        return registrationService.addUser(registrationDTO);
    }
    @GetMapping
    public ResponseEntity<List<Registration>> showUser(){
        return registrationService.showUser();
    }
}
