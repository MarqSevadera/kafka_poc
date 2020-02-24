package com.mrq.kafka.pubsub.poc.models;

public class UserModel {

    private String username;
    private String password;
    private String address;
    private String gender;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Username: " + username + "  | Password: " + password +"  | Address: " + address + "  | " + "Gender: " + gender;
    }
}
