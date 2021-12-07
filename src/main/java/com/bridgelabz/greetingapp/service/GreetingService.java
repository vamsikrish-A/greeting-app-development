package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.Greeting;
import com.bridgelabz.greetingapp.entity.GreetingEntity;
import com.bridgelabz.greetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{
    @Autowired
    private GreetingRepo greetingRepo;
    private static final String  template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting addGreeting(GreetingEntity greetingEntity) {
        String message = String.format(template,(greetingEntity.toString().isEmpty())?
                "Hello World" : greetingEntity.toString());
        return greetingRepo.save(new Greeting(counter.incrementAndGet(), message));
    }
    @Override
    public Greeting getGreetingById(long id) {
        return greetingRepo.findById(id).get();
    }
}
