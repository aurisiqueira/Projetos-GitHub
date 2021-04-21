import java.util.Scanner;

public class ObjetoDiario {

    private String[] mes = {
        "Janeiro",
        "Fevereiro",
        "Março",
        "Abril",
        "Maio",
        "Junho",
        "Julho",
        "Agosto",
        "Setembro",
        "Outubro",
        "Novembro",
        "Dezembro",
       };

       private int num_mes;

    Scanner input = new Scanner(System.in);

   

    public void setSelecionarMes(){
        Scanner input = new Scanner(System.in);
        System.out.println("01 ----- Janeiro");
        System.out.println("02 ----- Fevereiro");
        System.out.println("03 ----- Março");
        System.out.println("04 ----- Abril");
        System.out.println("05------ Maio");
        System.out.println("01 ----- Junho");
        System.out.println("07 ----- Julho");
        System.out.println("08 ----- Agosto");
        System.out.println("09 ----- Setembro");
        System.out.println("10 ----- Outubro");
        System.out.println("11 ----- Novembro");
        System.out.println("12 ----- Dezembro");
        System.out.println("");
        System.out.print("Infome o número do mês: ");
        num_mes = input.nextInt();
        System.out.print("");
        System.out.println("Mês selecionado --> "+mes[num_mes-1]);
    
    }

    public int getSelecionarMes(){
        return num_mes;
    }

    
}
