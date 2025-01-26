package com.coinnect.coinnect.repository;

import com.coinnect.coinnect.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail(String email);
}
