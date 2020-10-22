package com.asc.loanservice.domain.validation.validator.impl;

import com.asc.loanservice.annotations.DataValidator;
import com.asc.loanservice.contracts.LoanRequestDto;
import com.asc.loanservice.domain.time.Clock;
import com.asc.loanservice.domain.validation.LoanRequestDataValidator;
import com.asc.loanservice.domain.validation.LoanRequestValidationResult;

@DataValidator
class CustomerBirthdayValidator implements LoanRequestDataValidator {

    private final Clock clock;

    CustomerBirthdayValidator(Clock clock) {
        this.clock = clock;
    }

    @Override
    public LoanRequestValidationResult validate(LoanRequestDto loanRequestDto) {
//        LocalDate customerBirthday = loanRequestDto.getCustomerBirthday();
//        if (customerBirthday == null) {
//            return LoanRequestValidationResult.invalid("Provided empty customer birthday");
//        }
//
//        if (!customerBirthday.isBefore(clock.getCurrentDate())) {
//            return LoanRequestValidationResult.invalid("Provided customer birthday must be before today");
//        }

        return LoanRequestValidationResult.valid();
    }
}