package com.login_page.Login_Website.Repository;

import com.login_page.Login_Website.Model.MyAppUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MyAppuserrepository extends MongoRepository<MyAppUser, Long> {
    Optional<MyAppUser> findByUsername(String username);
}
