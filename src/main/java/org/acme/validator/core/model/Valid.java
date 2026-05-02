package org.acme.validator.core.model;

public record Valid<T>(
        T value
) implements ValidationResult<T> {
}
