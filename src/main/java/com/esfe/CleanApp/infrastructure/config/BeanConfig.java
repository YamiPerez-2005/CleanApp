package com.esfe.CleanApp.infrastructure.config;

import com.esfe.CleanApp.application.usecase.CheckDbHealthService;
import com.esfe.CleanApp.domain.port.in.CheckDbHealtUseCase;
import com.esfe.CleanApp.domain.port.out.SqlHealthPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*Wiring: conecta puertos del dominio con adaptadores concretos*/
@Configuration
public class BeanConfig {
    @Bean
    CheckDbHealtUseCase checkDbHealtUseCase(SqlHealthPort port){

        return new CheckDbHealthService(port);
    }
}
