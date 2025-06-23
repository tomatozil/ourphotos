package io.demo.ourphotos.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    POST_NOT_FOUND(100, "Post Entity Not Found"),

    INTERNAL_SYSTEM_ERROR(500, "Internal System Error");

    private final int code;
    private final String message;
}
