package com.cloudeagle.cloudeagledropsync.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Actor {
    @JsonProperty(".tag")
    private String tag;
    private User user;
    private User admin;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class User {
        @JsonProperty(".tag")
        private String tag;
        @JsonProperty("team_member_id")
        private String teamMemberId;
        @JsonProperty("account_id")
        private String accountId;
        private String email;
        @JsonProperty("display_name")
        private String displayName;
    }
}

