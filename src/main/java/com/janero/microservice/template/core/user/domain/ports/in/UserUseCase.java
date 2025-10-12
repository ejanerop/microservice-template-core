package com.janero.microservice.template.core.user.domain.ports.in;

import com.janero.microservice.template.core.user.domain.model.User;

public interface UserUseCase {

    User findById(Long id);

}
