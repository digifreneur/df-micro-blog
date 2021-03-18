package com.digifreneur.microblog.config;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Jakarta"));
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
