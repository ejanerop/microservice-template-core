package com.janero.microservice.template.core.user.infrastructure.persistence.mapper;

import org.mapstruct.Mapper;
import com.janero.microservice.template.core.shared.infrastructure.config.CustomMapperConfig;
import com.janero.microservice.template.core.user.domain.model.User;
import com.janero.microservice.template.core.user.infrastructure.persistence.entity.UserEntity;

@Mapper(config = CustomMapperConfig.class)
public interface UserEntityMapper {

    User toModel(UserEntity entity);

}
