package org.acme.validator.core.model;

import java.util.List;

public record Invalid<T>(
        List<ValidationError> errors
) implements ValidationResult<T> {
}
