package com.artemkurovskyi.customer;

import com.artemkurovskyi.clients.fraud.FraudCheckResponse;
import com.artemkurovskyi.clients.fraud.FraudClient;
import com.artemkurovskyi.clients.notification.NotificationClient;
import com.artemkurovskyi.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;
    private final NotificationClient notificationClient;

    public void registerCustomer(CustomerRegistrationRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.getFirstName())
                .lastName(customerRequest.getLastName())
                .email(customerRequest.getEmail())
                .build();

        //check if email valid
        //check if email not taken
        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

        if (fraudCheckResponse.getIsFraudulentCustomer()) {
            throw new IllegalStateException("fraudster");
        }

        //send notification
        notificationClient.sendNotification(
                new NotificationRequest(
                        customer.getId(),
                        customer.getEmail(),
                        String.format("Hi %s, welcome to my Application", customer.getFirstName())
                )
        );
    }
}
