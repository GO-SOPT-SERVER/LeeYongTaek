package com.sopt.lyt.soptseminar.common.exception;

import com.sopt.lyt.soptseminar.exception.ErrorStatus;

public class SoptNotFoundException extends SoptException{
    public SoptNotFoundException(ErrorStatus errorStatus) {
        super(errorStatus);
    }
}
