package com.janero.microservice.template.core.user.infrastructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.janero.microservice.template.core.user.domain.ports.in.UserUseCase;
import com.janero.microservice.template.core.user.infrastructure.controller.mapper.UserControllerMapper;
import com.janero.microservice.template.core.user.infrastructure.controller.response.UserResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserUseCase service;

    private final UserControllerMapper mapper;

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(mapper.toResponse(service.findById(id)));
    }

}
