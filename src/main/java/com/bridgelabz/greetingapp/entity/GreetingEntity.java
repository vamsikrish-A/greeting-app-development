package com.bridgelabz.greetingapp.entity;
import lombok.Data;

@Data
public class GreetingEntity {
    private Long id;
    private String firstName;
    private String lastName;


    @Override
    public String toString() {
        String str = (firstName != null) ? firstName +" " : " ";
        str += (lastName != null) ? lastName : "";
        return str.trim();
    }
}
