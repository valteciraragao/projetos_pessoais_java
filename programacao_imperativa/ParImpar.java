/**
 * Jogo par ou ímpar
 *
 * @author Valtecir Aragão
 * @version 1.0.0
 *
*/

import java.util.Random;
import java.util.Scanner;

public class ParImpar {
    /**
     * Main method to execute the program.
     *
     */
    public static void main(String[] args) {
        Random geradorDeJogada = new Random();
        Scanner sc = new Scanner(System.in);
        String primeiroJogador;
        String segundoJogador;
        String escolhaPrimeiroJogador;
        String escolhaSegundoJogador;
        int jodadaPrimeiroJogador;
        int jogadaSegundoJogador;
        int somaJogada;

        System.out.println("/n ########## Bem-vindo ao jogo do Par ou Ímpar #########");
        System.out.println("Vamos conhcer nossos jogadores e sua jogada!!!");
        System.out.println("Digite o nome do primeiro jogador: ");
        primeiroJogador = sc.nextLine();
        System.out.println("Digite o nome do segundo jogador: ");
        segundoJogador = sc.nextLine();
        System.out.println(primeiroJogador + " Escolha sua opção (par ou impar): ");
        escolhaPrimeiroJogador = sc.nextLine();
        escolhaSegundoJogador = escolhaPrimeiroJogador.equals("par") ? "impar" : "par";
        System.out.println("Gerando jogadas...");
        jodadaPrimeiroJogador = geradorDeJogada.nextInt(11);
        jogadaSegundoJogador = geradorDeJogada.nextInt(11);
        somaJogada = jodadaPrimeiroJogador + jogadaSegundoJogador;

        if(somaJogada % 2  == 0 && escolhaPrimeiroJogador.equals("par")){
            System.out.println(primeiroJogador + " você escolheu par e ganhou!");
        }


        sc.close();

    }
}
