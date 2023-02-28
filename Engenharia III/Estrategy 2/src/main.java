import java.util.Scanner;

public class main {

public static void main(String[] args) {

        Scanner menu = new Scanner (System.in);        
        
        System.out.print("##--Menu de Esportes--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Futebol           |\n");
        System.out.print("| Opção 2 - Volei             |\n");
        System.out.print("| Opção 3 - Basquete          |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();

        Esporte esporte = new Esporte();

         switch (opcao) {
            case 1:
                System.out.print("\nFutebol Selecionado\n");
                System.out.print("------------ZAGUEIRO------------\n");
                esporte.setFutebol(new Zagueiro());
                esporte.jogarFutebol();
                System.out.print("------------ATACANTE------------\n");
                esporte.setFutebol(new Atacante());
                esporte.jogarFutebol();
                System.out.print("-----------------------------\n");
                break;

            case 2:
                System.out.print("\nVolei Selecionado\n");
                System.out.print("------------LEVANTADOR------------\n");
                esporte.setVolei(new Levantador());
                esporte.baterBola();
                System.out.print("------------CENTRAL------------\n");
                esporte.setVolei(new Central());
                esporte.baterBola();
                System.out.print("-----------------------------\n");
                break;

            case 3:
                System.out.print("\nBasquete Selecionado\n");
                System.out.print("------------ARMADOR------------\n");
                esporte.setBasquete(new Armador());
                esporte.arremessarBola();
                System.out.print("------------PIVO------------\n");
                esporte.setBasquete(new Pivo());
                esporte.arremessarBola();
                System.out.print("-----------------------------\n");
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;

}
}
}