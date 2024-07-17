package br.com.cubosacademy.exerciciospatterns.segundo;

public class Carro implements Veiculo{
    private boolean ligado = false;

    public void ligar() {
        if (this.ligado) {
            System.out.println("O carro já está ligado.");
            return;
        }
        this.ligado = true;
        System.out.println("Carro ligado.");
    }
    public void desligar() {
        if (!this.ligado) {
            System.out.println("O carro já está desligado.");
            return;
        }
        this.ligado = false;
        System.out.println("Carro desligado.");
    }
    public void acelerar() {
        if (!this.ligado) {
            System.out.println("Não é possível acelerar. O carro está desligado.");
            return;
        }
        System.out.println("VRUMM!");
    }
    public void frear() {
        System.out.println("Freio acionado!");
    }
}
