package com.user.service.repositories;

import com.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,String>
{
    //if you want implement any custom method ot Query
    //Then please write here
}
