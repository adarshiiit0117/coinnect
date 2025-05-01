package com.coinnect.coinnect.repository;

import com.coinnect.coinnect.modal.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Long> {
Wallet findByUserId(Long useId);
}
