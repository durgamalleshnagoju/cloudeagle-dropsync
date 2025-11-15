package com.cloudeagle.cloudeagledropsync.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SharingPolicy {
    @JsonProperty("shared_folder_member_policy")
    private String sharedFolderMemberPolicy;
    @JsonProperty("shared_folder_join_policy")
    private String sharedFolderJoinPolicy;
    @JsonProperty("shared_link_create_policy")
    private String sharedLinkCreatePolicy;
}

