package org.acme.validator.core.model;

import java.util.List;

public record ValidationSummary(
       List<ValidationError> warnings,
       List<ValidationError> errors,
       Boolean isValid
) {
}
