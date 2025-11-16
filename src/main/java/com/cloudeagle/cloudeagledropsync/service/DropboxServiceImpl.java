package com.cloudeagle.cloudeagledropsync.service;

import com.cloudeagle.cloudeagledropsync.config.DropBoxConfig;
import com.cloudeagle.cloudeagledropsync.exception.DropboxServiceException;
import com.cloudeagle.cloudeagledropsync.model.MembersListResponse;
import com.cloudeagle.cloudeagledropsync.model.SignInEventsRequest;
import com.cloudeagle.cloudeagledropsync.model.SignInEventsResponse;
import com.cloudeagle.cloudeagledropsync.model.TeamInfoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class DropboxServiceImpl  implements DropboxService {

    private final DropBoxConfig dropBoxConfig;
    private final RestClient dropboxRestClient;

    @Override
    public TeamInfoResponse getTeamInfo(String token) {
        try {
            log.info("Fetching team info from dropbox");
            return dropboxRestClient.post()
                    .uri(dropBoxConfig.getTeamInfo())
                    .header("Authorization", "Bearer " + token)
                    .retrieve()
                    .body(TeamInfoResponse.class);
        } catch (Exception e) {
            log.error("Error fetching team info from dropbox: {}", e.getMessage(), e);
            throw new DropboxServiceException("Failed to fetch team info from Dropbox", e);
        }
    }

    @Override
    public MembersListResponse getMembersList(String token) {
        try {
            log.info("Fetching members from dropbox");
            return dropboxRestClient.post()
                    .uri(dropBoxConfig.getMembersList())
                    .header("Authorization", "Bearer " + token)
                    .retrieve()
                    .body(MembersListResponse.class);
        } catch (Exception e) {
            log.error("Error fetching members list from dropbox: {}", e.getMessage(), e);
            throw new DropboxServiceException("Failed to fetch members list from Dropbox", e);
        }
    }

    @Override
    public SignInEventsResponse getSignInEvents(Integer limit, String tag, String startTime, String endTime, String token) {
        try {
            log.info("Fetching sign-in events from dropbox");
            return dropboxRestClient.post()
                    .uri(dropBoxConfig.getSignInEvents())
                    .header("Authorization", "Bearer " + token)
                    .body(buildSignInEventsRequest(limit, tag, startTime, endTime))
                    .retrieve()
                    .body(SignInEventsResponse.class);
        } catch (Exception e) {
            log.error("Error fetching sign-in events from dropbox: {}", e.getMessage(), e);
            throw new DropboxServiceException("Failed to fetch sign-in events from Dropbox", e);
        }
    }

    private SignInEventsRequest buildSignInEventsRequest(Integer limit, String tag, String startTime, String endTime) {
        return SignInEventsRequest.builder().limit(limit)
                .time(SignInEventsRequest.TimeRange.builder()
                        .startTime(startTime).endTime(endTime).tag(tag).build()).build();
    }
}
