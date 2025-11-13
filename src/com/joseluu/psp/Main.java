package com.joseluu.psp;

import com.joseluu.psp.herramientas.Herramientas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
        Main to execute activity 13, tanda 1
     */

    public static void main(String[] args) {
        Herramientas agente1 = new Herramientas("A");
        Herramientas agente1_2 = new Herramientas("A");
        Herramientas agente2 = new Herramientas("B");
        Herramientas agente3 = new Herramientas("C");


        agente1.start();
        agente1_2.start();
        agente2.start();
        agente3.start();
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