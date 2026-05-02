package org.acme.validator.core.model;

public record ValidationError(
        String code,
        String message,
        Severity severity
) {
}
