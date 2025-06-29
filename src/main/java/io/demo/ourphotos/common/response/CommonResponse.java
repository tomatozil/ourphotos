package io.demo.ourphotos.common.response;

import lombok.Builder;

@Builder
public record CommonResponse<T> (
        Result result,
        T data,
        String message,
        Integer errorCode
) {

    public static <T> CommonResponse<T> success(T data, SuccessCode code) {
        return (CommonResponse<T>) CommonResponse.builder()
                .result(Result.SUCCESS)
                .data(data)
                .message(code.getMessage())
                .build();
    }

    public static <T> CommonResponse<T> success(T data) {
        return success(data, SuccessCode.OK);
    }

    public static <T> CommonResponse<T> success() {
        return success(null, SuccessCode.OK);
    }

    public static CommonResponse fail(ErrorCode code) {
        return CommonResponse.builder()
                .result(Result.FAIL)
                .message(code.getMessage())
                .errorCode(code.getCode())
                .build();
    }

    public enum Result {
        SUCCESS, FAIL
    }
}
