package com.example.backoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import com.example.backoffice.trip.TripTools;

@SpringBootApplication
public class BackofficeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackofficeApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider tripToolsProvider(TripTools tripTools) {
        return MethodToolCallbackProvider.builder()
            .toolObjects(tripTools)
            .build();
    }
}