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
public class Policies {

    private SharingPolicy sharing;

    @JsonProperty("emm_state")
    private TagWrapper emm;

    @JsonProperty("office_addin")
    private TagWrapper officeAddin;

    @JsonProperty("suggest_members_policy")
    private TagWrapper suggestMembers;

    @JsonProperty("top_level_content_policy")
    private TagWrapper topLevelContentPolicy;
}

