package com.cloudeagle.cloudeagledropsync.controller;

import com.cloudeagle.cloudeagledropsync.model.MembersListResponse;
import com.cloudeagle.cloudeagledropsync.model.SignInEventsResponse;
import com.cloudeagle.cloudeagledropsync.model.TeamInfoResponse;
import com.cloudeagle.cloudeagledropsync.service.DropboxService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/dropbox")
public class DropboxController {

    private final DropboxService dropboxService;

    @GetMapping("/team-info")
    public ResponseEntity<TeamInfoResponse> getTeamInfo(@RequestHeader String token) {
        TeamInfoResponse response = dropboxService.getTeamInfo(token);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/members")
    public ResponseEntity<MembersListResponse> getMembers(@RequestHeader String token) {
        MembersListResponse response = dropboxService.getMembersList(token);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/signin-events")
    public ResponseEntity<SignInEventsResponse> getSignInEvents(
            @RequestParam Integer limit,@RequestParam String tag,@RequestParam String startTime,@RequestParam String endTime,@RequestHeader String token) {
        SignInEventsResponse response = dropboxService.getSignInEvents(limit, tag, startTime, endTime, token);
        return ResponseEntity.ok(response);
    }
}

