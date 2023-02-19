package com.artemkurovskyi.clients.fraud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FraudCheckResponse {

    Boolean isFraudulentCustomer;
}
