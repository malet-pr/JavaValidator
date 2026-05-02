package org.acme;

import org.acme.validator.examples.applicant.Applicant;
import org.acme.validator.examples.applicant.Pipelines;
import org.acme.validator.examples.applicant.Rules;
import org.acme.validator.core.model.ValidationError;
import org.acme.validator.core.model.ValidationResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public class Main {
    static void main() {

        List<Function<Applicant, Optional<ValidationError>>> rules = List.of( Rules.nameIsRequired,
                                                                                Rules.mustBeAdult,
                                                                                Rules.depositPositive,
                                                                                Rules.youngUnemployed);

        Applicant applicant1 = new Applicant(null,16,0,false,false);
        Applicant applicant2 = new Applicant("Marcus",16,0,true,false);
        Applicant applicant3 = new Applicant("Lucas",22,100,false,false);
        Applicant applicant4 = new Applicant("John",42,1000,true,false);
        Applicant applicant5 = new Applicant("",42,1000,true,false);

        ValidationResult<Applicant> vr1 = Pipelines.validatePipeline1(applicant1, rules);
        ValidationResult<Applicant> vr2 = Pipelines.validatePipeline1(applicant2, rules);
        ValidationResult<Applicant> vr3 = Pipelines.validatePipeline1(applicant3, rules);
        ValidationResult<Applicant> vr4 = Pipelines.validatePipeline1(applicant4, rules);
        ValidationResult<Applicant> vr5 = Pipelines.validatePipeline1(applicant5, rules);

        System.out.println("Applicant 1: " + vr1);
        System.out.println("Applicant 2: " + vr2);
        System.out.println("Applicant 3: " + vr3);
        System.out.println("Applicant 4: " + vr4);
        System.out.println("Applicant 5: " + vr5);

    }
}
