package com.asc.loanservice.domain.loan.validation;

import com.asc.loanservice.contracts.LoanRequestDto;

class CustomerNameSpecification implements LoanRequestInputDataSpecification {

    @Override
    public boolean isSatisfiedBy(LoanRequestDto loanRequestDto) {
        var customerName = loanRequestDto.getCustomerName();
        return customerName != null;
    }
}