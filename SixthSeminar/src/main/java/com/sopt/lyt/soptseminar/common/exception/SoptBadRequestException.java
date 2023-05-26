package com.sopt.lyt.soptseminar.common.exception;

import com.sopt.lyt.soptseminar.exception.ErrorStatus;

public class SoptBadRequestException extends SoptException{
    public SoptBadRequestException(ErrorStatus errorStatus) {
        super(errorStatus);
    }
}
