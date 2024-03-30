package ru.asteises.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.asteises.userservice.model.entity.User;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserJpaRepository extends JpaRepository<User, UUID> {

    @Query("""
            select u from User as u
            left join fetch u.roles
            where u.username = :username
            and u.deleted = false
            """)
    Optional<User> findByUsernameAndDeletedFalse(String username);
}
