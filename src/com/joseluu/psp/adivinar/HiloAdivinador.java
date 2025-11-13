package com.joseluu.psp.adivinar;

public class HiloAdivinador extends Thread {

    private final NumeroOculto numeroOculto;

    public HiloAdivinador(NumeroOculto numeroOculto, String nombre) {
        super(nombre);
        this.numeroOculto = numeroOculto;
    }

    @Override
    public void run() {
        while (true) {
            int intento = (int)(Math.random()*101);
            int resultado = numeroOculto.propuestaNumero(intento);

            if (resultado == -1) {
                System.out.println(getName() + "se detiene: otro hilo ya ha acertado.");
                break;
            } else if (resultado == 1) {
                System.out.println(getName() + "has adivinado" + intento);
                break;
            } else if (resultado == 2) {
                System.out.println(getName() + "propone " + intento + "(incorrecto)");
            }

            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                break;
            }
        }
    }
}
