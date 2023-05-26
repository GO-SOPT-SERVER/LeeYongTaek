package com.sopt.lyt.soptseminar.common.exception;

import com.sopt.lyt.soptseminar.exception.ErrorStatus;
import lombok.Getter;

@Getter
public class SoptException extends RuntimeException {
    private ErrorStatus errorStatus;

    public SoptException(ErrorStatus errorStatus) {
        super(errorStatus.getMessage());
        this.errorStatus = errorStatus;
    }
}
