package br.com.cubosacademy.exerciciospatterns.segundo;

public class Moto implements Veiculo{
    private boolean ligado = false;

    public void ligar() {
        if (this.ligado) {
            System.out.println("A moto já está ligada.");
            return;
        }
        this.ligado = true;
        System.out.println("Moto ligada.");
    }
    public void desligar() {
        if (!this.ligado) {
            System.out.println("Moto já está desligada.");
            return;
        }
        this.ligado = false;
        System.out.println("Moto desligada.");
    }
    public void acelerar() {
        if (!this.ligado) {
            System.out.println("Não é possível acelerar. Moto desligada.");
            return;
        }
        System.out.println("VRUMM!!!");
    }
    public void frear() {
        System.out.println("Freio acionado.");
    }
}
