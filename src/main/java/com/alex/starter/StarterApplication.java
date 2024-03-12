package com.alex.starter;

import com.alex.starter.model.Jopa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApplication implements CommandLineRunner {

    @Autowired
    Jopa jopa;

    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        jopa.srat();
    }
}
