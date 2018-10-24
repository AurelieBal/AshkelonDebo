package com.telRan.mish.Model;

public class NotRegistredUserData {
    private  String myEmail;
    private  String password;
    private String passwordRep;

    public NotRegistredUserData setMyEmail(String myEmail) {
        this.myEmail = myEmail;
        return this;
    }

    public NotRegistredUserData setPassword(String password) {
        this.password = password;
        return this;
    }

    public NotRegistredUserData setPasswordRep(String passwordRep) {
        this.passwordRep = passwordRep;
        return this;
    }

    public String getMyEmail() {
        return myEmail;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordRep() {
        return passwordRep;
    }
}
