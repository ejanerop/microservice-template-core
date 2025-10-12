package com.janero.microservice.template.core.user.infrastructure.controller.mapper;

import org.mapstruct.Mapper;
import com.janero.microservice.template.core.shared.infrastructure.config.CustomMapperConfig;
import com.janero.microservice.template.core.user.domain.model.User;
import com.janero.microservice.template.core.user.infrastructure.controller.response.UserResponse;

@Mapper(config = CustomMapperConfig.class)
public interface UserControllerMapper {

    UserResponse toResponse(User model);

}
