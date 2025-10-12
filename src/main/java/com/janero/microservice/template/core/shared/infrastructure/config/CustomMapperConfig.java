package com.janero.microservice.template.core.shared.infrastructure.config;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
   componentModel = "spring",
   unmappedTargetPolicy = ReportingPolicy.IGNORE,
   unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public class CustomMapperConfig {

}
