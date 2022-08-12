package com.yourbookapp.bookapp.data;

import com.yourbookapp.bookapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
