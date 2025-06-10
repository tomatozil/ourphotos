package io.demo.ourphotos.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    EMPTY_CONSTRUCTOR_ARGUMENT("constructor argument is empty");

    private final String message;
}
