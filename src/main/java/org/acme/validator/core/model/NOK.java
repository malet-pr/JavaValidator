package org.acme.validator.core.model;

import java.util.List;

public record NOK<T>(
        List<ValidationError> errors
) implements ValidationOutcome<T> {
}
