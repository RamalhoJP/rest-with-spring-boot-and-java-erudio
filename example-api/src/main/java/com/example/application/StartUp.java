package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
// import org.springframework.security.crypto.password.DelegatingPasswordEncoder;

// import java.util.HashMap;
// import java.util.Map;

@SpringBootApplication
public class StartUp {

    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);

        // Map<String, PasswordEncoder> encoders = new HashMap<>();
        
        // // Configuração correta do Pbkdf2PasswordEncoder
        // Pbkdf2PasswordEncoder pbkdf2Encoder = new Pbkdf2PasswordEncoder("", 8, 185000, Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
        
        // encoders.put("pbkdf2", pbkdf2Encoder);
        
        // DelegatingPasswordEncoder passwordEncoder = new DelegatingPasswordEncoder("pbkdf2", encoders);
        // passwordEncoder.setDefaultPasswordEncoderForMatches(pbkdf2Encoder);

        // // Gerando o hash de uma senha
        // String result = passwordEncoder.encode("admin234");
        // System.out.println("My hash: " + result);
    }
}