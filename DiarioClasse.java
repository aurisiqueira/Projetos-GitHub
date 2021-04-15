import java.util.Scanner;

public class DiarioClasse{
    public static void main(String[] args){

        int[][] calendario = new int[5][7];
        int dia = 0;
        int num_alunos;
        String[][] status = new String[5][7];
        String[] mes = new String[12];
        mes[0] = "Janeiro";
        mes[1] = "Fevereiro";
        mes[2] = "Março";
        mes[3] = "Abril";
        mes[4] = "Maio";
        mes[5] = "Junho";
        mes[6] = "Julho";
        mes[7] = "Agosto";
        mes[8] = "Setembro";
        mes[9] = "Outubro";
        mes[10] = "Novembro";
        mes[11] = "Dezembro";
    
        Scanner input = new Scanner(System.in);
    
        System.out.println("|        Diário de Classe         |");
        System.out.println("Quantidade de alunos na turma: ");
        num_alunos = input.nextInt();
        String[] alunos = new String[num_alunos];

        System.out.println("");
        System.out.println("|        Nome dos alunos:        |");
        for(int i=0; i<alunos.length; i++){
            System.out.println("Aluno "+(i+1)+": ");
            alunos[i] = input.next();
            
        }
    
        System.out.println("");
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
        int numero_mes = input.nextInt();
        System.out.println("");
        System.out.println("Mês selecionado --> "+mes[numero_mes-1]);
    
            
            
        for (int i=0; i<5; i++){ //referente ao numero de semanas no mês
             for (int x=0; x<7 ; x++){ //referente ao numero de dias na semana
                    calendario[i][x] = dia+1;
                    dia++;       
                    
            }
        }
            
    
           
    
            System.out.println("");
            System.out.println("");
    
            System.out.println("Informe P (presente), F (falta) ou '-' para dias sem aula");
            for (int j=0; j<alunos.length; j++){
                System.out.println("Aluno: "+alunos[j]);
                for(int k=0; k<calendario.length; k++){
                    for (int x=0; x<calendario[k].length; x++){
                        if(numero_mes ==1 || numero_mes==3 || numero_mes==5 || numero_mes==7 || numero_mes == 8  || numero_mes == 10 || numero_mes == 12){
                            if(calendario[k][x] <32){
                            System.out.print("Dia "+calendario[k][x] + ":");
                            status[k][x] = input.nextLine();
                            }
                        }
                        else if(numero_mes==4 || numero_mes==6 || numero_mes==9 || numero_mes == 11){ 
                            if(calendario[k][x] <31){
                                System.out.print("Dia "+calendario[k][x] + ":");
                                status[k][x] = input.nextLine();
                            }
                        } 
                        
                        else if(numero_mes==2){ 
                            if(calendario[k][x] <29){
                                System.out.print("Dia "+calendario[k][x] + ":");
                                status[k][x] = input.nextLine();
                            }
                        }  
                        
                        
    
                    }
                }
                System.out.println("");
            }
    
            System.out.println("");
    
            for (int j=0; j<alunos.length; j++){
                System.out.println("Aluno: "+alunos[j]);
                for(int i=0; i<calendario.length; i++){
                    for (int x=0; x<calendario[i].length; x++){
                        System.out.print("Dia "+calendario[i][x] + " ("+status[i][x]+")    ");
                        
                    }
                    System.out.println(" ");
                    
                }
                System.out.println("");
                
            }    
        }
        
}