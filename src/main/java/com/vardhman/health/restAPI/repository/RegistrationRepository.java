package com.vardhman.health.restAPI.repository;

import com.vardhman.health.restAPI.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;


public interface RegistrationRepository extends JpaRepository<Registration,Long> {

    @Query("SELECT u FROM Registration u WHERE u.email=?1 and u.phoneNumber=?2")
    Optional<Registration> authenticateUsers(String email, String phoneNumber);


}
