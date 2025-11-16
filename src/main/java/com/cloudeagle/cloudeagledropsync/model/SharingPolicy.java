package com.cloudeagle.cloudeagledropsync.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SharingPolicy {

    @JsonProperty("shared_folder_member_policy")
    private TagWrapper sharedFolderMemberPolicy;

    @JsonProperty("shared_folder_join_policy")
    private TagWrapper sharedFolderJoinPolicy;

    @JsonProperty("shared_link_create_policy")
    private TagWrapper sharedLinkCreatePolicy;

    @JsonProperty("group_creation_policy")
    private TagWrapper groupCreationPolicy;

    @JsonProperty("shared_folder_link_restriction_policy")
    private TagWrapper sharedFolderLinkRestrictionPolicy;

    @JsonProperty("enforce_link_password_policy")
    private TagWrapper enforceLinkPasswordPolicy;

    @JsonProperty("default_link_expiration_days_policy")
    private TagWrapper defaultLinkExpirationDaysPolicy;

    @JsonProperty("shared_link_default_permissions_policy")
    private TagWrapper sharedLinkDefaultPermissionsPolicy;
}

