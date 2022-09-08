package com.devspring.userdept.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.devspring.userdept.entities.User; 

public interface UserRepository  extends JpaRepository<User, Long> {

}
