package org.acme.validator.core.model;

public sealed interface ValidationOutcome<T>
        permits OK, NOK {
}
