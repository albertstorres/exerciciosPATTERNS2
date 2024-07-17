package br.com.cubosacademy.exerciciospatterns.segundo;

public class TesteFabricaVeiculo {
    public static void main(String [] args) {
        Veiculo veiculo = FabricaVeiculo.getInstance("Carro");
        veiculo.ligar();
        veiculo.acelerar();
        veiculo.frear();
        veiculo.desligar();
    }
}
