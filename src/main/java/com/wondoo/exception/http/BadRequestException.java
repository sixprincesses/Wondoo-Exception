package com.wondoo.exception.http;

import com.wondoo.exception.ErrorCode;
import com.wondoo.exception.WondooException;

public class BadRequestException extends WondooException {
    public BadRequestException(ErrorCode errorCode) {
        super(errorCode);
    }
}
