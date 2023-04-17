public class main {
    public static void main(String[] args) {
        System.out.println("---- FUTEBOL ----");
        System.out.println("#chutarBola");
        Esporte esporte = new Esporte();
        esporte.setFutebol(new Zagueiro());
        esporte.jogarFutebol();

        esporte.setFutebol(new Atacante());
        esporte.jogarFutebol();
    }
}