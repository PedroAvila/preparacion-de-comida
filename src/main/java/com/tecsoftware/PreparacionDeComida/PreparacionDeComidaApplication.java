package com.tecsoftware.PreparacionDeComida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PreparacionDeComidaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreparacionDeComidaApplication.class, args);
		RegistrarPlatoPrincipalOccidental(new FabricaComidaOccidental());
	}
	
	static void RegistrarPlatoPrincipalOccidental(IFabricaDeComida fabricaDeComida) {
		IPlatoPrincipal platoPrincipal = fabricaDeComida.PrepararPlatoPrincipal("Arroz con Pollo", 10.0D);
		
		System.out.println("Restaurant ACME");
		System.out.println("========================================");
		System.out.println("");
		System.out.println(platoPrincipal);
	}

	
}
