package com.coinnect.coinnect.service;

import com.coinnect.coinnect.domain.VerificationType;
import com.coinnect.coinnect.modal.ForgotPasswordToken;
import com.coinnect.coinnect.modal.User;
import com.coinnect.coinnect.modal.VerificationCode;

public interface ForgotPasswordService {
    ForgotPasswordToken createToken(User user, String id, String otp, VerificationType verificationType, String sendTO);
    ForgotPasswordToken findById(String id);
    ForgotPasswordToken findByUser(Long userId);
    void deleteToken(ForgotPasswordToken token);
}
