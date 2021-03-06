package com.banking.loan.application.validation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.banking.loan.api.contracts.LoanRequestDto;
import com.banking.shared.time.Clock;

@ExtendWith(MockitoExtension.class)
class LoanRequestInputDataValidationServiceTest {

    @Mock
    private Clock clock;
    @InjectMocks
    private LoanRequestInputDataValidationService loanRequestInputDataValidationService;

    @Test
    void shouldPerformValidationWhenDtoIsNotNull() {
        //given
        var loanRequestDto = mock(LoanRequestDto.class);

        //when
        var validationResult = loanRequestInputDataValidationService.isValid(loanRequestDto);

        //then
        assertThat(validationResult).isNotNull();
        verify(clock).getCurrentDate();
    }

    @Test
    void shouldNotPerformValidationWhenDtoIsNull() {
        //given
        var loanRequestDto = (LoanRequestDto) null;

        //when
        var validationResult = loanRequestInputDataValidationService.isValid(loanRequestDto);

        //then
        assertThat(validationResult).isFalse();
        verifyZeroInteractions(clock);
    }
}