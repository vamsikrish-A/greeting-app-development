package com.bridgelabz.greetingapp.dto;

import javax.persistence.*;

@Entity
@Table(name = "greeting")
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final long id;
    private final String message;

    public  Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public long getId() {
        return id;
    }
}
