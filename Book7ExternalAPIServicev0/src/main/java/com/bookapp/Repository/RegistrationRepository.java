package com.bookapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.Entity.User;

@Repository
public interface RegistrationRepository extends JpaRepository<User, Long> {

}
