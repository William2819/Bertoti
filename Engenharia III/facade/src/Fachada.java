public class Fachada {
    private ClienteDaOperadora cliente;
    private Operadora operadora;

    public Fachada() {
        this.cliente = new ClienteDaOperadora();
        this.operadora = new Operadora();
    }

    public void fazerLigacao(ClienteDaOperadora cliente, Operadora operadora){
        System.out.printf("Olá, o cliente de sua operadora é o(a) %s\n",cliente.obterNomeDoCliente());
        System.out.printf("A operadora é %s\n", operadora.obterNome());
        System.out.printf("O número é %s\n", operadora.obterNumero());
    }

    public ClienteDaOperadora getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDaOperadora cliente) {
        this.cliente = cliente;
    }

    public Operadora getNumero() {
        return operadora;
    }

    public void setNumero(Operadora operadora) {
        this.operadora = operadora;
    }
}