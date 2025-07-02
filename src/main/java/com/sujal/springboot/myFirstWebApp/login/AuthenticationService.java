package com.sujal.springboot.myFirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean validateUser(String userName, String password){
        boolean validUsername = userName.equals("Sujal Choudhary");
        boolean validPassword = password.equals("Sujal@123");
        return validUsername && validPassword;
    }
}
