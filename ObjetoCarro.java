public class ObjetoCarro {
    public static void main (String[] args){

        Carro carro = new Carro("Volkswagen","Gol", 4, 0.2);

        System.out.println("               |Informações do Carro|          ");
        System.out.println("Modelo: "+carro.marca);
        System.out.println("Marca: "+carro.modelo);
        System.out.println("Nº de portas: "+carro.numPortas);
        System.out.println("Consumo de Combustível: "+carro.consCombustivel);

        carro.setCor(carro.PRETO);
        carro.setquantPneus(4);
        carro.setcapCombustivel(50);
        carro.setnumPassageiros(5);
        carro.informarValores();
        

        
        
    }
    
}
