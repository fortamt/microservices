package com.artemkurovskyi.customer;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerRegistrationRequest {

    String firstName;
    String lastName;
    String email;
}
