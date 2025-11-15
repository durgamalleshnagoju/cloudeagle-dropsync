package com.cloudeagle.cloudeagledropsync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInEventsRequest {
    private Integer limit;
    private TimeRange time;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TimeRange {
        private String tag;
        private String startTime;
        private String endTime;
    }
}