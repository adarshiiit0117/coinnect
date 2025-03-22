package com.coinnect.coinnect.request;

import com.coinnect.coinnect.domain.VerificationType;
import lombok.Data;

@Data
public class ForgotPasswordTokenRequest {
    private String sendTo;
    private VerificationType verificationType;
}
