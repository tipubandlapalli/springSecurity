package com.example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    // now it will not need userName & password
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(customizer -> customizer.disable()); // csrf disabled
        // now not even csrf-needed for post put delete request
        // we our config now
        httpSecurity.authorizeHttpRequests(req -> req.anyRequest().authenticated());
        //for browser to display default login form
        httpSecurity.formLogin(Customizer.withDefaults());
        // for post man to take user and password from auth basic
        httpSecurity.httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }
}
