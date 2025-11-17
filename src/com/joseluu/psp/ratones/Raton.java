package com.joseluu.psp.ratones;

public class Raton implements Runnable {

    private final String nombre;

    public Raton(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println(nombre + " empieza a correr...");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        System.out.println(nombre + " termina.");
    }


    public static void main(String[] args) {

        Thread t1 = new Thread(new Raton("Ratón 1"));
        Thread t2 = new Thread(new Raton("Ratón 2"));
        Thread t3 = new Thread(new Raton("Ratón 3"));

        t1.run();
        t2.run();
        t3.run();
    }


}
