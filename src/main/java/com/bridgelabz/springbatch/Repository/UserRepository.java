package com.bridgelabz.springbatch.Repository;

import com.bridgelabz.springbatch.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}