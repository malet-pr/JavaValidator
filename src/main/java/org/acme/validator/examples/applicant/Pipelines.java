package org.acme.validator.examples.applicant;

import org.acme.validator.core.model.ValidationError;
import org.acme.validator.core.model.ValidationResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import static org.acme.validator.core.validation.Mappers.mapValid;
import static org.acme.validator.core.validation.Runners.validateFirstError;
import static org.acme.validator.core.validation.Runners.validateWithSummary;

public final class Pipelines {

    private Pipelines() {}

    public static ValidationResult<Applicant> validatePipeline1(Applicant applicant, List<Function<Applicant, Optional<ValidationError>>> validators) {
        ValidationResult<Applicant> vr = validateWithSummary(validators, applicant);
        return mapValid(vr, Rules.normalizeName.andThen(Rules::withValidated));
    }

    public static ValidationResult<Applicant> validatePipeline2(Applicant applicant, List<Function<Applicant, Optional<ValidationError>>> validators) {
        ValidationResult<Applicant> vr = validateFirstError(applicant,validators);
        return mapValid(vr,Rules.normalizeName.andThen(Rules::withValidated));
    }

}


