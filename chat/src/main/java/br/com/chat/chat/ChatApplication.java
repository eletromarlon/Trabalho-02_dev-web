package br.com.chat.chat;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.chat.chat.model.Usuario;
import br.com.chat.chat.repositories.UsuarioRepository;

@SpringBootApplication
public class ChatApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Usuario u1 = new Usuario(null, "Marlon Duarte", "eletromarlon@gmail.com", "Masculino", null, "123");
		//Usuario u2 = new Usuario(null, "Zairo Bastos", "zairo@gmail.com", "Masculino", null, "321");

		//usuarioRepository.saveAll(Arrays.asList(u1, u2));

	}

}
