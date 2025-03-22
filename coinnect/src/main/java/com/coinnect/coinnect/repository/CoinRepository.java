package com.coinnect.coinnect.repository;

import com.coinnect.coinnect.modal.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin,String> {

}
