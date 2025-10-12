package com.janero.microservice.template.core.user.application.service;

import org.springframework.stereotype.Service;
import com.janero.microservice.template.core.user.domain.model.User;
import com.janero.microservice.template.core.user.domain.ports.in.UserUseCase;
import com.janero.microservice.template.core.user.domain.ports.out.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements UserUseCase {

    private final UserRepository repo;

    @Override
    public User findById(Long id) {
        return repo.findById(id);
    }

}
