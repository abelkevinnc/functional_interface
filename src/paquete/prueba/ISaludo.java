package paquete.prueba;

@FunctionalInterface
public interface ISaludo {
	public String sayHelloTo(String name); // unico metodo abstracto funcional

	public default String sayHelloWord() { // metodo default
		return "Hello word";
	}
	
	//pueden haber muchos metodos default como variables estaticas
}
