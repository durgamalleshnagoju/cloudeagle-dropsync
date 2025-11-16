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
public class MemberProfile {
    @JsonProperty("team_member_id")
    private String teamMemberId;
    @JsonProperty("account_id")
    private String accountId;
    private String email;
    @JsonProperty("email_verified")
    private Boolean emailVerified;
    private TagWrapper status;
    private MemberName name;
    @JsonProperty("membership_type")
    private TagWrapper membershipType;
}

