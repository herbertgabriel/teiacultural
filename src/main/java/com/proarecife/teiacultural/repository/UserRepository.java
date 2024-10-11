package com.proarecife.teiacultural.repository;

import com.proarecife.teiacultural.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
