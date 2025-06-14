package io.demo.ourphotos.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    POST_NOT_FOUND("no posts found");

    private final String message;
}
