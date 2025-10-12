package com.janero.microservice.template.core.user.infrastructure.persistence;

import org.springframework.stereotype.Component;
import com.janero.microservice.template.core.user.domain.model.User;
import com.janero.microservice.template.core.user.domain.ports.out.UserRepository;
import com.janero.microservice.template.core.user.infrastructure.persistence.jpa.UserJpaRepository;
import com.janero.microservice.template.core.user.infrastructure.persistence.mapper.UserEntityMapper;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository repo;

    private final UserEntityMapper mapper;

    @Override
    public User findById(Long id) {
        return repo.findById(id).map(mapper::toModel).orElse(null);
    }

}
