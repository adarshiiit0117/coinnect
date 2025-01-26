package com.coinnect.coinnect.modal;

import com.coinnect.coinnect.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {
    private boolean isEnabled=false;
    private VerificationType sendTo;
}
