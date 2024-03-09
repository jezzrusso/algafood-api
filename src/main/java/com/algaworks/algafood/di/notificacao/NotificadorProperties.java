package com.algaworks.algafood.di.notificacao;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("notificador.email")
@Data
public class NotificadorProperties {

    private String hostServidor;
    private Integer portaServidor;
}
