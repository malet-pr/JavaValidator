package org.acme.validator.core.model;

import java.util.List;

public record OK<T>(
        T value,
        List<ValidationError> warnings
) implements ValidationOutcome<T> {
}
