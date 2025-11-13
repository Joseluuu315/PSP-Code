package com.joseluu.psp.adivinar;

public class NumeroOculto {

    private final int numero;
    private boolean terminado = false;

    public NumeroOculto() {
        this.numero = (int) (Math.random() * 101);
        System.out.println("Numero Oculto: " + numero);
    }
    public synchronized int propuestaNumero(int num) {
        if (terminado) {
            return -1;  // el juego ya ha terminado
        }
        if (num == numero) {
            terminado = true;
            return 1;  // acierto
        } else {
            return 0;  // incorrecto
        }
    }

    public boolean isTerminado() {
        return terminado;
    }

}
