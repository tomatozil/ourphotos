package io.demo.ourphotos.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    POST_NOT_FOUND(100, "no posts found");

    private final int code;
    private final String message;
}
