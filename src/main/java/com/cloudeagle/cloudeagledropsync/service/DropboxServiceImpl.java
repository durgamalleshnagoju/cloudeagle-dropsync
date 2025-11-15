package com.cloudeagle.cloudeagledropsync.service;

import com.cloudeagle.cloudeagledropsync.config.DropBoxConfig;
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
        log.info("Fetching team info from dropbox");
        return dropboxRestClient.post()
                .uri(dropBoxConfig.getTeamInfo())
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .body(TeamInfoResponse.class);
    }

    @Override
    public MembersListResponse getMembersList(String token) {
        log.info("Fetching members from dropbox");
        return dropboxRestClient.post()
                .uri(dropBoxConfig.getMembersList())
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .body(MembersListResponse.class);
    }

    @Override
    public SignInEventsResponse getSignInEvents(SignInEventsRequest request, String token) {
        log.info("Fetching sign-in events from dropbox");
        return dropboxRestClient.get()
                .uri(dropBoxConfig.getSignInEvents())
                .header("Authorization", "Bearer " + token)
                .retrieve()
                .body(SignInEventsResponse.class);
    }
}
