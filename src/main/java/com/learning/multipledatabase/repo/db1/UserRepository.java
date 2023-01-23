package com.learning.multipledatabase.repo.db1;

import com.learning.multipledatabase.entity.db1.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

}
