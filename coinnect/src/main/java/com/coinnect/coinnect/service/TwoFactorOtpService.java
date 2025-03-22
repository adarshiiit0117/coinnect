package com.coinnect.coinnect.service;

import com.coinnect.coinnect.modal.TwoFactorOTP;
import com.coinnect.coinnect.modal.User;
import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.stereotype.Service;



public interface TwoFactorOtpService {
    TwoFactorOTP createTwoFactorOtp(User user,String otp,String jwt);
    TwoFactorOTP findByUser(Long userId);
    TwoFactorOTP findById(String id);
    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOtp,String otp);
    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOtp);


}
