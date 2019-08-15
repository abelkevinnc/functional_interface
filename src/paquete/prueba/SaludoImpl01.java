package paquete.prueba;

public class SaludoImpl01 implements ISaludo{

	@Override
	public String sayHelloTo(String name) {
		return name+ ", Te saludo desde una clase implementada: ";
	}

}
