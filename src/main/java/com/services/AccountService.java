package com.services;

import com.models.Account;
import com.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findAllAccount(){
        return accountRepository.findAll();
    }

    public Optional<Account> findAccountById(long id){
        return accountRepository.findById(id);
    }
    public Optional<Account> findAccountByUsername(String username){
        return accountRepository.findByUsername(username);
    }

    public Account save(Account account){
        return accountRepository.save(account);
    }

    public void deleteAccount(long id){
        accountRepository.deleteById(id);
    }

    public List<Account> search(String keyword){
        return accountRepository.searchAccount(keyword);
    }
}
