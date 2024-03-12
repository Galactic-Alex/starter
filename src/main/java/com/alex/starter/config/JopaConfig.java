package com.alex.starter.config;

import com.alex.starter.model.Jopa;
import com.alex.starter.properties.JopaProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(JopaProperties.class)
public class JopaConfig {

    @Autowired
    JopaProperties jopaProperties;

    @Bean
    public Jopa jopa() {
        if (jopaProperties.getSize() == null) {
            jopaProperties.setSize("2");
        }
        return new Jopa(jopaProperties);
    }
}
