
package leafs;

import composite.forma;

public class triangulo implements forma{
    @Override
	public void desenho(String corDesenho) {
		System.out.println("Desenho de triângulo com cor "+corDesenho);
	}    
}