package org.example.design_patterns_interview.design_atm.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class AtmCard {
    User user;
    Long cardNo;
    int cvv;
    int pin;
    LocalDate expiryDate;

}
