import java.util.Scanner;

public class DiarioClasse{
    public static void main(String[] args){

        int[][] calendario = new int[5][7];
        int dia = 0;
        int num_alunos;
        int num_mes;
        String[][] status = new String[5][7];

        ObjetoDiario diario = new ObjetoDiario();
        
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

        
        diario.setSelecionarMes();
        num_mes = diario.getSelecionarMes();
            
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
                    if(num_mes ==1 || num_mes==3 || num_mes==5 || num_mes==7 || num_mes == 8  || num_mes == 10 || num_mes == 12){
                        if(calendario[k][x] <32){
                         System.out.print("Dia "+calendario[k][x] + ":");
                         status[k][x] = input.next();
                         }
                    }

                    else if(num_mes==4 || num_mes==6 || num_mes==9 || num_mes == 11){ 
                        if(calendario[k][x] <31){
                            System.out.print("Dia "+calendario[k][x] + ":");
                            status[k][x] = input.next();
                        }
                    } 
                        
                    else if(num_mes==2){ 
                        if(calendario[k][x] <29){
                            System.out.print("Dia "+calendario[k][x] + ":");
                            status[k][x] = input.next();
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
                     if (status[i][x] != null){

                        System.out.print("Dia "+calendario[i][x] + " ("+status[i][x]+")    ");
                    }
                        
                }
                System.out.println(" ");                
            }
            System.out.println("");
                
        }    
    }
        
}