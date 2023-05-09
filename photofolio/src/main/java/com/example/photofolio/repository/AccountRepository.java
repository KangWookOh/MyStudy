package com.example.photofolio.repository;
import com.example.photofolio.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {

    Optional<Account> findById(String ac_Id);


}
