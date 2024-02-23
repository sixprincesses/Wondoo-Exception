package com.wondoo.exception.http;

import com.wondoo.exception.ErrorCode;
import com.wondoo.exception.WondooException;

public class InternalServerException extends WondooException {
    public InternalServerException(ErrorCode errorCode) {
        super(errorCode);
    }
}
