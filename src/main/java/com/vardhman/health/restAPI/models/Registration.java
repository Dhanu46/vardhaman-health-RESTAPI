package com.vardhman.health.restAPI.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.aspectj.apache.bcel.ExceptionConstants;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",updatable = false,nullable = false)
    private long id;

    @NotBlank(message = "Name Can't be null")
    @Column(unique = true)
    private String name;

    @NotBlank(message = "Email Can't be Null")
    @Email(message = "Must be a Valid email")
    private String email;

    @NotBlank(message = "Phone Number can't be Null")
    @Size(min=10,max=10,message = "Phone number should be 10 digits")
    private String phoneNumber;
    @NotNull(message = "Date Cannot be null")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd")
    private LocalDate dob;

    private int age;

}
