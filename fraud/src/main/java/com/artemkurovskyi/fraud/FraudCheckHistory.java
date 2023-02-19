package com.artemkurovskyi.fraud;

import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(name = "fraud_id_sequence", sequenceName = "fraud_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fraud_id_sequence")
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}