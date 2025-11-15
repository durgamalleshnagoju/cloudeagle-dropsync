package com.cloudeagle.cloudeagledropsync;

import com.cloudeagle.cloudeagledropsync.config.DropBoxConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DropBoxConfig.class)
public class CloudeagleDropsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudeagleDropsyncApplication.class, args);
    }

}
