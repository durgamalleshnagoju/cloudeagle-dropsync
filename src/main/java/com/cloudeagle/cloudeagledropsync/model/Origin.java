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
public class Origin {
    @JsonProperty("geo_location")
    private GeoLocation geoLocation;
    @JsonProperty("access_method")
    private AccessMethod accessMethod;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GeoLocation {
        @JsonProperty("ip_address")
        private String ipAddress;
        private String city;
        private String region;
        private String country;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AccessMethod {
        @JsonProperty(".tag")
        private String tag;
        @JsonProperty("end_user")
        private EndUser endUser;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EndUser {
        @JsonProperty(".tag")
        private String tag;
        @JsonProperty("session_info")
        private String sessionInfo;
    }
}

