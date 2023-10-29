package com.geekster.Recipe.Management.repo;

import com.geekster.Recipe.Management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
}
