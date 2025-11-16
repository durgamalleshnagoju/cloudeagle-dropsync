package com.cloudeagle.cloudeagledropsync.exception;

import lombok.Getter;

@Getter
public class DropboxServiceException extends RuntimeException {

    private final String errorMessage;

    public DropboxServiceException(String message, Throwable cause) {
        super(message, cause);
        this.errorMessage = message;
    }

}

