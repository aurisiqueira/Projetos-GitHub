public class Carro {
    

        static final String VERMELHO = "Vermelho";
        static final String PRETO = "Preto";
        static final String BRANCO = "Branco";
        private int quantPneus;
        private int quantCalotas;
        private int numPassageiros;
        private double capCombustivel;
        static String marca;
        static String modelo;
        static int numPortas;
        static double consCombustivel;
    
        public Carro(String marca, String modelo, int numPortas, double consCombustivel ){
            this.marca = marca;
            this.modelo = modelo;
            this.numPortas = numPortas;
            this.consCombustivel = consCombustivel;
        }
    
        public void setCor(String cor){
            System.out.println(cor);
        }
    
        
        
        public void setquantPneus(int quantPneus){
            quantCalotas = quantPneus;
            this.quantPneus = quantPneus;
    
    
        }
        public int getquantPneus(){
            return quantPneus+1; // acrescenta +1 porque conta com o step
        }
        public int getquantCalotas(){
            return quantCalotas+1;
        }
    
        public void setnumPassageiros(int numPassageiros){
            this.numPassageiros = numPassageiros;
    
        }
    
        public int getnumPassageiros(){
            return numPassageiros;
        }
    
        public void setcapCombustivel(double capCombustivel){
            this.capCombustivel = capCombustivel;
    
    
        }
    
        public double getcapCombustivel(){
            return capCombustivel;
    
        }
    
        public void informarValores(){
            System.out.println("Quantidade de Pneus: "+ getquantPneus());
            System.out.println("Quanttidade de Calotas: "+getquantCalotas());
            System.out.println("Capacidade de passageiros: "+ getnumPassageiros());
            System.out.println("Capacidade de combustível (L) : "+ getcapCombustivel());
           
        }
    
    
    
        
    
    
        
    
    
}
