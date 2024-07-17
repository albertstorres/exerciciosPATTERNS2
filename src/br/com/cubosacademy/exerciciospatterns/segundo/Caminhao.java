package br.com.cubosacademy.exerciciospatterns.segundo;

public class Caminhao implements Veiculo {
    boolean ligado = false;

    public void ligar() {
        if (this.ligado) {
            System.out.println("O caminhão já está ligado.");
            return;
        }
        this.ligado = true;
        System.out.println("Caminhão ligado.");
    }
    public void desligar() {
        if (!this.ligado) {
            System.out.println("Caminhão já está desligado.");
            return;
        }
        this.ligado = false;
        System.out.println("Caminhão desligado.");
    }
    public void acelerar(){
        if (!this.ligado) {
            System.out.println("Não é possível acelerar. Caminhão desligado.");
            return;
        }
        System.out.println("VRUM!!!");
    }
    public void frear() {
        System.out.println("Freio acionado!!");
    }
}
