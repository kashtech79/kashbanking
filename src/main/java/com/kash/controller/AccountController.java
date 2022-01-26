//package com.kash.controller;
//
//import com.kash.entity.CurrentAccount;
//import com.kash.entity.User;
//import com.kash.repository.UserRepository;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.security.Principal;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api")
//public class AccountController {
//
//    private UserRepository userRepository;
//
//    public AccountController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @PostMapping("/currentAccount")
//    public ResponseEntity<Object> currentAccount(Principal principal){
//        Optional<User> user = userRepository.findByUsername(principal.getName());
//        CurrentAccount currentAccount = user.get().getCurrentAccount();
//        return new ResponseEntity<>(currentAccount, HttpStatus.OK);
//    }
//}
