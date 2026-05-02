package org.acme.validator.core.model;

import org.acme.validator.examples.applicant.Applicant;

import java.util.List;

public record ValidWithWarnings(
        Applicant applicant,
        List<ValidationError> warnings
) {
}
