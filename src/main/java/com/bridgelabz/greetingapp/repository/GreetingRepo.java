package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.dto.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepo extends JpaRepository<Greeting, Long> {
}
