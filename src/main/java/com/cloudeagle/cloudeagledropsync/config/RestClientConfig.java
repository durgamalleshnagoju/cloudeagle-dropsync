package com.cloudeagle.cloudeagledropsync.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

@Configuration
public class RestClientConfig {

    @Value("${dropbox.base-url}")
    private String baseUrl;

    @Bean
    public RestClient dropboxRestClient() {
        return RestClient.builder()
                .baseUrl(baseUrl)
//                .defaultHeader(CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}

