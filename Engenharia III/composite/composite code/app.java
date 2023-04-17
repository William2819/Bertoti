import composite.forma;
import leafs.circulo;
import leafs.triangulo;

public class app {
    public static void main(String args[]) {
        forma tri = new triangulo();
        forma tri1 = new triangulo();
        forma cir = new circulo();

        desenho desenho = new desenho();
        desenho.adicionar(tri1);
        desenho.adicionar(tri);
        desenho.adicionar(cir);

        desenho.desenho("Amarelo");

        desenho.limpar();

        desenho.adicionar(tri1);
        desenho.adicionar(cir);
        desenho.desenho("Verde");

        desenho.remover(cir);
    }
}