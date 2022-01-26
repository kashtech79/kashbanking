//package com.kash.service;
//
//import com.kash.entity.CurrentAccount;
//import com.kash.repository.CurrentAccountRepository;
//import com.kash.repository.UserRepository;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//
//@Service
//public class AccountService {
//    private static int accountNumber = 11111;
//
//    private UserRepository userRepository;
//    private CurrentAccountRepository currentAccountRepository;
//
//    public AccountService(UserRepository userRepository, CurrentAccountRepository currentAccountRepository) {
//        this.userRepository = userRepository;
//        this.currentAccountRepository = currentAccountRepository;
//    }
//
//    public CurrentAccount createAccount(){
//        CurrentAccount currentAccount = new CurrentAccount();
//        currentAccount.setAccountNumber(accountGen()+"111");
//        currentAccount.setAccountBalance(new BigDecimal(0.0));
//        currentAccount.setAccountNumber(currentAccount.getAccountNumber());
//        currentAccountRepository.save(currentAccount);
//        return currentAccount;
//    }
//
//    private String accountGen(){
//        return "C" + ++accountNumber;
//    }
//}
