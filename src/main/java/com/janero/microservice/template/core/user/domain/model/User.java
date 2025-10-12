package com.janero.microservice.template.core.user.domain.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class User {

    private Long id;

    private String externalId;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private Boolean enabled;
    private LocalDateTime deletedAt;

}
