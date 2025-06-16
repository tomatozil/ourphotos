package io.demo.ourphotos.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessCode {
    OK(200, "요청 성공");

    private final int code;
    private final String message;
}
