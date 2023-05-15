public class ClienteDaOperadora {
    private String nome;

    public String obterNomeDoCliente(){
        return this.nome;
    }

    public ClienteDaOperadora(){}

    public ClienteDaOperadora (String nome){
        this.nome = nome;
    }

}