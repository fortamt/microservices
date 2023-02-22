package com.artemkurovskyi.clients.notification;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class NotificationRequest {

    Integer toCustomerId;
    String toCustomerName;
    String message;
}
