package com.tecsoftware.PreparacionDeComida;

import java.math.BigDecimal;

public interface IFabricaDeComida {
	
	IPlatoPrincipal PrepararPlatoPrincipal(String nombre, Double precio);
	IPostre PrepararPostre(String nombre, Double precio);

}
