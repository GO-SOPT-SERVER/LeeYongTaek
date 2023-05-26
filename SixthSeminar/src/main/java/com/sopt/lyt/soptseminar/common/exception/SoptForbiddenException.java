package com.sopt.lyt.soptseminar.common.exception;

import com.sopt.lyt.soptseminar.exception.ErrorStatus;

public class SoptForbiddenException extends SoptException{
    public SoptForbiddenException(ErrorStatus errorStatus) {
        super(errorStatus);
    }
}
