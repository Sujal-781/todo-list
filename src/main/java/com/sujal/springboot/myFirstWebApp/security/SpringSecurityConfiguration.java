package com.sujal.springboot.myFirstWebApp.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        Function<String, String> PasswordEncoder = input -> passwordEncoder().encode(input);
        UserDetails userDetails = getUserDetails(PasswordEncoder);

        return new InMemoryUserDetailsManager(userDetails);


    }

    private static UserDetails getUserDetails(Function<String, String> PasswordEncoder) {
        UserDetails userDetails = User.builder()
                .passwordEncoder(PasswordEncoder)
                .username("Sujal Choudhary")
                .password("Sujal@123")
                .roles("USER","ADMIN")
                .build();
        return userDetails;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

