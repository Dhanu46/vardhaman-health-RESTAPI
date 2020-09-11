package com.vardhman.health.restAPI.services;

import com.vardhman.health.restAPI.dto.LoginDTO;
import com.vardhman.health.restAPI.models.Registration;
import com.vardhman.health.restAPI.repository.RegistrationRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class LoginService {
   private final RegistrationRepository registrationRepository;
    public ResponseEntity<String> authenticate(LoginDTO loginDTO) {
        Optional<Registration> registration = registrationRepository.authenticateUsers(loginDTO.getEmail(), loginDTO.getPhoneNumber());
        if(registration.isPresent())
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Login Successful");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login Unsuccessful");
    }
}
