package ru.asteises.userservice.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.asteises.userservice.model.entity.User;
import ru.asteises.userservice.repository.UserJpaRepository;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user = userJpaRepository.findByUsernameAndDeletedFalse(username);
        log.info("user: {}", user);
        return user.map(u -> new UserDetailsImpl())
                .orElseThrow(
                        () -> new UsernameNotFoundException(String.format("User with username: %s not found", username)));
    }
}
