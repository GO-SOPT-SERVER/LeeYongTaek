package com.sopt.lyt.soptseminar.common.exception;

import com.sopt.lyt.soptseminar.exception.ErrorStatus;

public class SoptConflictException extends SoptException{
    public SoptConflictException(ErrorStatus errorStatus) {
        super(errorStatus);
    }
}
