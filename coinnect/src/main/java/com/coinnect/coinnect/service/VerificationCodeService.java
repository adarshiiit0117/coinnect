package com.coinnect.coinnect.service;

import com.coinnect.coinnect.domain.VerificationType;
import com.coinnect.coinnect.modal.User;
import com.coinnect.coinnect.modal.VerificationCode;

public interface VerificationCodeService {
    VerificationCode sendVerificationCode(User user, VerificationType verificationType);
    VerificationCode getVerificationCodeById(Long id) throws Exception;
    VerificationCode getVerificationCodeByUser(Long userId);
    void deleteVerificationCodeById(VerificationCode verificationCode);
}
