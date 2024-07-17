package br.com.cubosacademy.exerciciospatterns.segundo;

public class FabricaVeiculo {
    public static Veiculo getInstance (String veiculo) {
        switch (veiculo) {
            case "Carro" : return new Carro();
            case "Moto" : return new Moto();
            case "Caminhao" : return new Caminhao();
            default : throw new ArithmeticException("Tipo de veículo inválido.");
        }
    }
}
