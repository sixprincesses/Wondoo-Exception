package com.wondoo.exception;

public interface ErrorCode {
    int getStatusCode();

    String getErrorCode();

    String getMessage();
}
