public class Esporte {
    private Futebol futebol;
    public void setFutebol(Futebol sfutebol){
        futebol = sfutebol;
    }
    public void jogarFutebol(){
        futebol.chutarBola();
    }
    private Basquete basquete;
    public void setBasquete(Basquete sbasquete){
        basquete = sbasquete;
    }
    public void arremessarBola(){
        basquete.arremessarBola();
    }
    private Volei volei;
    public void setVolei(Volei svolei){
        volei = svolei;
    }
    public void baterBola(){
        volei.baterBola();
    }


}