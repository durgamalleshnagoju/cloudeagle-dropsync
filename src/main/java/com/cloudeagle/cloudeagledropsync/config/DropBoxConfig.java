package com.cloudeagle.cloudeagledropsync.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "dropbox.endpoints")
public class DropBoxConfig {
    private String teamInfo;
    private String membersList;
    private String signInEvents;
}
