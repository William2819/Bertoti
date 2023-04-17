package leafs;

import composite.forma;

public class circulo implements forma{
    @Override
	public void desenho(String corDesenho) {
		System.out.println("Desenho de círculo com cor "+corDesenho);
	}
}