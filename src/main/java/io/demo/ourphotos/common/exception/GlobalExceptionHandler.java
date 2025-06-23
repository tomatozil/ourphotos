package io.demo.ourphotos.common.exception;

import io.demo.ourphotos.common.response.CommonResponse;
import io.demo.ourphotos.common.response.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public CommonResponse handleBusinessException(final Exception e) {
        // log 출력
        return CommonResponse.fail(ErrorCode.INTERNAL_SYSTEM_ERROR);
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(BusinessException.class)
    public CommonResponse handleBusinessException(final BusinessException e) {
        // log 출력
        return CommonResponse.fail(e.getErrorCode());
    }
}
