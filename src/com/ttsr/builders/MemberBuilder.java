package com.ttsr.builders;

import com.ttsr.members.Member;

public class MemberBuilder implements Builder{

    private String role;
    private int rating;
    private String name;
    private String secondName;
    private String lastname;
    private String phoneNumber;
    private String email;

    @Override
    public void setRole(String role) {
        if(role == null) {
            this.role = "default";
        }else this.role = role;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        try {
            if(phoneNumber.length() == 11 && phoneNumber.matches("[0-9]+")) {
                this.phoneNumber = phoneNumber;
            }else throw new IllegalArgumentException("unknown phoneNumber format");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public Member build(){
        return new Member(role,rating,name,secondName,lastname,phoneNumber,email);
    }
}
