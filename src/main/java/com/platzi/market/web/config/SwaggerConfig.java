package com.platzi.market.web.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;


@OpenAPIDefinition(
        info = @Info(
                title = "API de Platzi Market",
                description = "API para gestión de productoss",
                termsOfService = "https://platzi.com/cursos/java-spring/",
                version = "1.0.0",
                summary = "Una plataforma para gestionar y productos",
                contact = @Contact(
                        name = "Platzi",
                        url = "https://platzi.com/cursos/java-spring/",
                        email = "saulolo@gmail.com"
                ),
                license = @License(
                        name = "propiedad",
                        url = "https://platzi.com/cursos/java-spring/"
                )
        ),
        servers = {
                @Server(
                        url = "/platzi-market/api"
                )
        }
)
public class SwaggerConfig {
}