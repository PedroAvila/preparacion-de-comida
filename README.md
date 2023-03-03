# Patrón Abstract Factory
Las fábricas y los productos son los principales participantes del patrón Abstract Factory. Este patrón muestra cómo crear familias de objetos producto relacionados sin instanciar las clases directamente. Es apropiado sobre todo cuando el número y tipo de los objetos producto permanece constante y hay diferencias entre las distintas familias de productos. Podemos elegir entre las distintas familias creando una instancia de una fábrica concreta y usándola de forma consistente para crear productos a partir de entonces. También podemos cambiar familias completas de productos reemplazando la fábrica concreta con una instancia de otra diferente. La importancia que el patrón Abstract Factory da a las familias de productos diferencia a éste de otros patrones de creación, que comprenden un solo tipo de objetos producto.

Proporciona una interfaz para crear familias de objetos relacionados o que dependen entre sí, sin especificar sus clases concretas.

![image](https://user-images.githubusercontent.com/6163491/222612371-03323db6-7e54-4bf6-8f25-f88b7663b04a.png)

Poniendo en práctica el patrón Abstract Factory

## Preparación de comida

![image](https://user-images.githubusercontent.com/6163491/222612608-80a324f2-451c-4812-9ea0-c4d67e8f6f30.png)


```
public interface IFabricaDeComida {
	
	IPlatoPrincipal PrepararPlatoPrincipal(String nombre, Double precio);
	IPostre PrepararPostre(String nombre, Double precio);

}
```
xxxxx

```
public interface IPlatoPrincipal {
	
}
```
xxxxx
```
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
```
xxxx

```
public class PlatoPrincipalOccidental implements IPlatoPrincipal {

	
	private String nombre;
	private Double precio;
	
	public PlatoPrincipalOccidental(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "PlatoPrincipalOccidental [nombre=" + nombre + ", precio=" + precio + "]";
	}
}
```

xxx

```
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
```

