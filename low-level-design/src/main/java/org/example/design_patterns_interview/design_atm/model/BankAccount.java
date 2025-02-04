package org.example.design_patterns_interview.design_atm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BankAccount {
    User user;
    AtmCard atmCard;
    BigDecimal bankBalance;
}
