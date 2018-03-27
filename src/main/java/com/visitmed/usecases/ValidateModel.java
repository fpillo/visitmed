package com.visitmed.usecases;

import com.visitmed.exceptions.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Service
public class ValidateModel {

    private final Validator validator;

    @Autowired
    public ValidateModel(final Validator validator) {
        this.validator = validator;
    }

    public void validate(final Object model) {
        final Set<ConstraintViolation<Object>> violations = validator.validate(model);
        if (!violations.isEmpty()) {
            throw new ValidationException();
        }

    }

}
