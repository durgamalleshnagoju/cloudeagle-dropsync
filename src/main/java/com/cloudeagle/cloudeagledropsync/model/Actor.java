package com.cloudeagle.cloudeagledropsync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private String tag;
    private User user;
    private Admin admin;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class User {
        private String tag;
        private String teamMemberId;
        private String accountId;
        private String email;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Admin {
        private String tag;
        private String teamMemberId;
        private String accountId;
        private String email;
    }
}

