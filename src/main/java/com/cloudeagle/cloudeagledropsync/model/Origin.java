package com.cloudeagle.cloudeagledropsync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Origin {
    private GeoLocation geoLocation;
    private AccessMethod accessMethod;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GeoLocation {
        private String ipAddress;
        private String city;
        private String region;
        private String country;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AccessMethod {
        private String tag;
        private EndUser endUser;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EndUser {
        private String tag;
        private SessionInfo sessionInfo;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SessionInfo {
        private String sessionId;
    }
}

