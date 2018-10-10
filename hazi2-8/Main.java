package iskola;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kő papír olló: ");
        String playerInput = scanner.nextLine();

        while (!playerInput.equals("vege")){

           int computerInput = random.nextInt(3); // 0 - ko  1 - papir 2 - ollo

           if (playerInput.equals("ko") && computerInput == 0) {
               System.out.println(playerInput + " VS Kő");
               System.out.println("Döntetlen!");
           }
           
            if (playerInput.equals("ko") && computerInput == 1){
                System.out.println(playerInput + " VS Papír");
                System.out.println("Győzött a számítógép!");
            }

            if (playerInput.equals("ko") && computerInput == 2){
                System.out.println(playerInput + " VS  Olló");
                System.out.println("Győzött a játékos!");
            }

            if (playerInput.equals("papir") && computerInput ==  0){
                System.out.println(playerInput + " VS Kő");
                System.out.println("Győzött a játékos!");
            }

            if (playerInput.equals("papir") && computerInput ==  1){
                System.out.println(playerInput + " VS Papír");
                System.out.println("Döntetlen!");
            }

            if (playerInput.equals("papir") && computerInput ==  2){
                System.out.println(playerInput + " VS Olló");
                System.out.println("Győzött a számítógép!");
            }

            if (playerInput.equals("ollo") && computerInput ==  0){
                System.out.println(playerInput + " VS Kő");
                System.out.println("Győzött a számítógép!");
            }

            if (playerInput.equals("ollo") && computerInput ==  1){
                System.out.println(playerInput + " VS Papír");
                System.out.println("Győzött a játékos!");
            }

            if (playerInput.equals("ollo") && computerInput ==  2){
                System.out.println(playerInput + " VS Papír");
                System.out.println("Döntetlen!");
            }

            System.out.println("Kő papír olló: ");
            playerInput = scanner.nextLine();

        }
    }
}
