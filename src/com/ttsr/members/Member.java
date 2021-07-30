package com.ttsr.members;

public class Member {
    private String role;
    private int rating;
    private String name;
    private String secondName;
    private String lastname;
    private String phoneNumber;
    private String email;

    public String getRole() {
        return role;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Member(String role, int rating, String name, String secondName, String lastname, String phoneNumber, String email) {
        this.role = role;
        this.rating = rating;
        this.name = name;
        this.secondName = secondName;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String print() {
        StringBuilder info = new StringBuilder();

        info.append("role: ").append(role).append("\n")
                .append("rating: ").append(rating).append("\n")
                .append("name: ").append(name).append("\n");

        if (secondName != null && !secondName.isBlank())
            info.append("rating: ").append(secondName).append("\n");

        info.append("lastname: ").append(lastname).append("\n");

        if (phoneNumber != null)
            info.append("phoneNumber: ").append(phoneNumber).append("\n");

        info.append("email: ").append(email).append("\n");

        return info.toString();
    }
}
