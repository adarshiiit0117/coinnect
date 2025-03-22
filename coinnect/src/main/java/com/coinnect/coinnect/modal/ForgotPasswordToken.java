package com.coinnect.coinnect.modal;

import com.coinnect.coinnect.domain.VerificationType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ForgotPasswordToken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String token;
    @OneToOne
    private User user;
    private  String otp;
    private VerificationType verificationType;
    private String sendTo;
}
