import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        System.out.println("|   Menu:                    |");
        System.out.println("|   Opções:                  |");
        System.out.println("|           1. Opção 1       |");
        System.out.println("|           2. Opção 2       |");
        System.out.println("|           3. Sair          |");

        Scanner input = new Scanner(System.in);
        System.out.print("Selecione uma opção: ");
        int opcao = input.nextInt();
        System.out.println(" ");

        while (opcao !=3){
            if (opcao == 1){
                System.out.println("Opção 1 selecionada.");
                System.out.println(" ");
                System.out.println("|   Menu:                    |");
                System.out.println("|   Opções:                  |");
                System.out.println("|           1. Opção 1       |");
                System.out.println("|           2. Opção 2       |");
                System.out.println("|           3. Sair          |");
                System.out.println(" ");
                System.out.print("Selecione uma opção: ");
                opcao = input.nextInt();
                System.out.println(" ");
            }
            else if (opcao == 2){
                System.out.println("Opção 2 selecionada.");
                System.out.println(" ");
                System.out.println("|   Menu:                    |");
                System.out.println("|   Opções:                  |");
                System.out.println("|           1. Opção 1       |");
                System.out.println("|           2. Opção 2       |");
                System.out.println("|           3. Sair          |");
                System.out.println(" ");
                System.out.print("Selecione uma opção: ");
                opcao = input.nextInt();
                System.out.println(" ");

            }
            else{
                System.out.print("Opção inválida. Selecione uma opção válida: ");
                opcao = input.nextInt();
                System.out.println(" ");
                
            }
        }

        if (opcao == 3){
            System.out.println("Sair!");
        }


    }
    
}
