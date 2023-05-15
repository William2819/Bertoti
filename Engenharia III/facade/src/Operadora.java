public class Operadora {
    private String nome;
    private int numero;

    public String obterNome(){
        System.out.println("Obtendo nome");
        return this.nome;
    }
    public int obterNumero(){
        System.out.println("Obtendo número");
        return this.numero;
    }


    public Operadora(){}

    public Operadora(String nome){
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public int setNumero(int numero) {
        this.numero = numero;
        return numero;
    }
}