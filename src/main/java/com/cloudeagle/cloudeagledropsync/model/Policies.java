package com.cloudeagle.cloudeagledropsync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Policies {
    private SharingPolicy sharing;
    private EmmPolicy emm;
    private OfficeAddinPolicy officeAddin;
}

