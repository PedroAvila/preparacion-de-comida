package com.tecsoftware.PreparacionDeComida;

import java.math.BigDecimal;

public class FabricaComidaOccidental implements IFabricaDeComida {

	@Override
	public IPlatoPrincipal PrepararPlatoPrincipal(String nombre, Double precio) {
		
		return new PlatoPrincipalOccidental(nombre, precio);
	}

	@Override
	public IPostre PrepararPostre(String nombre, Double precio) {
		// TODO Auto-generated method stub
		return null;
	}

}
