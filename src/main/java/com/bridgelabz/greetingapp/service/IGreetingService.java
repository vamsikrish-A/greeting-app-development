package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.Greeting;
import com.bridgelabz.greetingapp.entity.GreetingEntity;

public interface IGreetingService {
    Greeting addGreeting(GreetingEntity greetingEntity);
    Greeting getGreetingById(long id);
}
