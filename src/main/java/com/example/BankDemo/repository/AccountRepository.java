package com.example.BankDemo.repository;

import com.example.BankDemo.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
