package com.janero.microservice.template.core.user.infrastructure.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.janero.microservice.template.core.user.infrastructure.persistence.entity.UserEntity;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
    
}
