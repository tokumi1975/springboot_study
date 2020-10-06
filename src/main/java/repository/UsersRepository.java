package main.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.java.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
