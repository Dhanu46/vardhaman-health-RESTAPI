package com.vardhman.health.restAPI.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDTO {

    @NotBlank(message = "name is mandatory")
    @Size(min = 5,max = 255,message = "name must be at least 5 characters")
    private String name;
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Must be a valid Email")
    private String email;
    @NotBlank(message = "Phone Number Can't be Null")
    @Size(min = 10, max = 10, message = "Phone Number must contain 10 digits")
    private String phoneNumber;

    @NotNull(message = "Date of birth Can't be Null")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd")
    private LocalDate dob;
}
