package org.acme.validator.core.model;

public sealed interface ValidationResult<T> permits Valid, Invalid {
}

