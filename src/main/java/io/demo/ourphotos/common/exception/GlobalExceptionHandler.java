package io.demo.ourphotos.common.exception;

import jakarta.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Map<String, Object>> handleBusinessException(final BusinessException e) {
        final HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

        final Map<String, Object> body = Map.of(
                "timestamp", Instant.now(),
                "status", httpStatus.value(),
                "error", e.getMessage()
        );
        return ResponseEntity.status(httpStatus).body(body);
    }
}
