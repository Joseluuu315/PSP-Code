package com.joseluu.psp;

import com.joseluu.psp.herramientas.Herramientas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
        Main to execute activity 13, tanda 1
     */

    public static void main(String[] args) {

        Herramientas herramientas = new Herramientas();
        herramientas.usarDestornillador();
        herramientas.usarTaladro();


    }






    /*
            Main to execute activity 8 tanda 1
     */
//    public static void main(String[] args) {
//        NumeroOculto numeroOculto = new NumeroOculto();
//
//        for (int i = 1; i<=10; i++){
//            HiloAdivinador h = new HiloAdivinador(numeroOculto, "hilo-" + i);
//            h.start();
//        }
//    }
}