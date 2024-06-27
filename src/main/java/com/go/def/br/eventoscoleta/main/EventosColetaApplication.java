package com.go.def.br.eventoscoleta.main;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Swagger OpenApi", version = "1", description = "API desenvolvida para evento meu pai tem nome"))
public class EventosColetaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventosColetaApplication.class, args);
    }

}
