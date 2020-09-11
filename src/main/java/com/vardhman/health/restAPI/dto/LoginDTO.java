package com.vardhman.health.restAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {

    @NotBlank(message = "name is mandatory")
    @Email(message = "Should be a valid email")
    private String email;

    @NotBlank(message = "Phone Number Can't be Null")
    private String phoneNumber;

}
