package com.artemkurovskyi.clients.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotificationRequest {

    Integer toCustomerId;
    String toCustomerName;
    String message;
}
