package com.pixel0.Ex9.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pixel0.Ex9.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
