import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        // fórmular IMC = peso / (altura*altura)

        Scanner p = new Scanner(System.in);
        Scanner a = new Scanner(System.in);

        System.out.println("| Tabela IMC                                      |");
        System.out.println("|       Menor que 18,5 ----------- Abaixo do peso |");
        System.out.println("|       Entre 18,5 e 24,9 -------- Peso Normal    |");
        System.out.println("|       Entre 25 e 29,9 ---------- Sobrepeso      |");
        System.out.println("|       Entre 30 e 34,9 ---------- Obesidade 1    |");
        System.out.println("|       Entre 35 e 39,9 ---------- Obesidade 2    |");
        System.out.println("|       Maior que 40 ------------- Obesidade 3    |");




        System.out.print("Informe o peso: ");
        float peso = p.nextFloat();

        System.out.print("Informe a altura: ");
        float altura = a.nextFloat();

        float IMC = peso/(altura*altura);

        if(IMC < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if ((IMC >= 18.5) && (IMC <= 24.9) ){
            System.out.println("Peso normal");
        }
        else if ((IMC >= 25) && (IMC <= 29.9) ){
            System.out.println("Sobrepeso");
        }
        else if ((IMC >= 30) && (IMC <= 34.9) ){
            System.out.println("Obesidade 1");
        }
        else if ((IMC >= 35) && (IMC <= 39.9) ){
            System.out.println("Obesidade 2");
        }
        else if (IMC >=40){
            System.out.println("Obesidade 3");
        }






    }
    
}
