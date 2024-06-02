package com.mayan.myAPI;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mayan.myAPI.domain.Usuario;
import com.mayan.myAPI.repositories.UsuarioRepository;

@SpringBootApplication
public class MyApiApplication implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Mateus Mayan", "Mateus", "123");
		Usuario u2 = new Usuario(null, "Albert Einstein", "Albert", "123");
	
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
	}

}
