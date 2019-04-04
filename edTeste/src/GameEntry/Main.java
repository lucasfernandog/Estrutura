package GameEntry;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        GameEntry gameEntry;
        Scores scores = new Scores();

        boolean condicao = true;

        do {


            System.out.println("Código");
            System.out.println("1 - Add");
            System.out.println("2 - Remover");
            System.out.println("3 - Mostrar");
            System.out.println("0 - Sair");

            int operacao = ler.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Infome o nome do jogador: ");
                    String nome = ler.next();
                    System.out.println("Infome seu Score: ");
                    int score = ler.nextInt();
                    gameEntry = new GameEntry(nome, score);
                    scores.add(gameEntry);
                    break;
                case 2:
                    System.out.println(scores.toString());
                    System.out.println("Infome a posição que deseja remover: ");
                    int index = ler.nextInt();
                    System.out.println(scores.remove(index - 1) + " removido!");
                    break;
                case 3:
                    System.out.println(scores.toString());
                    break;
                case 0:
                    condicao = false;
                    break;
                default:
                    System.out.println("Operação invalida!");
                    break;
            }

        } while (condicao);
    }

}
