package com.kash.repository;

import com.kash.entity.CurrentAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentAccountRepository  extends JpaRepository<CurrentAccount, Long> {
    CurrentAccount findByAccountNumber(String accountNumber);
}
