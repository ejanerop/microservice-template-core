package com.janero.microservice.template.core.user.domain.ports.out;

import com.janero.microservice.template.core.user.domain.model.User;

public interface UserRepository {

    User findById(Long id);

}
