package com.joseluu.psp.definiciones;

public class MainDefi {

    //Condición de carrera
    private static int contador = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) contador++;
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) contador++;
        });

        t1.start();
        t2.start();
    }
    //Espera no activaç
    private boolean condicionLista = false;

    public void esperar() {
        System.out.println("Esperando a que la condición sea verdadera...");

        while(!condicionLista) {
            // Espera NO ACTIVA → quema CPU
        }

        System.out.println("¡Condición cumplida!");
    }

    public void completar() {
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        condicionLista = true;
        System.out.println("Condición establecida a verdadera.");
    }

    //Hilo
    public void run() {
        System.out.println("Estoy en un hilo!");
    }

    public void main() {
        this.run();
    }

    //Interbloqueo
    public void interBloqueo(){
        Object recurso1 = new Object();
        Object recurso2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (recurso1) {
                synchronized (recurso2) {
                    System.out.println("T1 usa ambos recursos");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (recurso2) {
                synchronized (recurso1) {
                    System.out.println("T2 usa ambos recursos");
                }
            }
        });
    }

    //método sincronizado
    public synchronized void sumar() {
        contador++;
    }

    //objeto de bloqueo
    private final Object lock = new Object();

    public void sumarBloqueo() {
        synchronized (lock) {
            contador++;
        }
    }

    //sección crítica

    private int saldo = 0;

    public void ingresar(int cantidad) {
        // SECCIÓN CRÍTICA
        synchronized(this) {
            int saldoAnterior = saldo;

            System.out.println(Thread.currentThread().getName() +
                    " va a ingresar " + cantidad +
                    " | saldo antes: " + saldoAnterior);

            saldo = saldo + cantidad;

            System.out.println(Thread.currentThread().getName() +
                    " ha ingresado " + cantidad +
                    " | saldo después: " + saldo);
        }
    }

    //Thread-safe
    public synchronized void incrementar() {
        contador++;
    }

}
