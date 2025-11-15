package com.cloudeagle.cloudeagledropsync.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Value("${dropbox.base-url}")
    private String baseUrl;

    @Bean
    public RestClient dropboxRestClient() {
        return RestClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
}

