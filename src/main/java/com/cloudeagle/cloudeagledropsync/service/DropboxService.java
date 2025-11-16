package com.cloudeagle.cloudeagledropsync.service;

import com.cloudeagle.cloudeagledropsync.model.MembersListResponse;
import com.cloudeagle.cloudeagledropsync.model.SignInEventsRequest;
import com.cloudeagle.cloudeagledropsync.model.SignInEventsResponse;
import com.cloudeagle.cloudeagledropsync.model.TeamInfoResponse;

public interface DropboxService {
    TeamInfoResponse getTeamInfo(String token);
    MembersListResponse getMembersList(String token);
    SignInEventsResponse getSignInEvents(Integer limit, String tag, String startTime, String endTime, String token);
}