package com.algaworks.algafood.di.notificacao;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
@RequiredArgsConstructor
public class NotificadorEmail implements Notificador {

	private final NotificadorProperties notificadorProperties;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host: " + notificadorProperties.getHostServidor());
		System.out.println("Port: " + notificadorProperties.getPortaServidor());


		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
