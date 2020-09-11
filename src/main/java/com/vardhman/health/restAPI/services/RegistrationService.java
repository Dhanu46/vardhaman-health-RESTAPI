package com.vardhman.health.restAPI.services;

import com.vardhman.health.restAPI.dto.RegistrationDTO;
import com.vardhman.health.restAPI.models.Registration;
import com.vardhman.health.restAPI.repository.RegistrationRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final RegistrationRepository registrationRepository;


    public ResponseEntity<Registration> addUser(RegistrationDTO registrationDTO) {
        Registration registration = new Registration();
        registration.setName(registrationDTO.getName());
        registration.setEmail(registrationDTO.getEmail());
        registration.setPhoneNumber(registrationDTO.getPhoneNumber());
        registration.setDob(registrationDTO.getDob());
        registration.setAge(LocalDate.now().getYear()-registrationDTO.getDob().getYear());

        registrationRepository.save(registration);

        return new  ResponseEntity<>(registration, HttpStatus.CREATED);
    }

    public ResponseEntity<List<Registration>> showUser() {
        List<Registration> users = new ArrayList<>(registrationRepository.findAll());
        return ResponseEntity.status(200).body(users);
    }
}
