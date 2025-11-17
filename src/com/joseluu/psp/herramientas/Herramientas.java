package com.joseluu.psp.herramientas;

public class Herramientas extends Thread {
    private final String agente;
    private final int timeToFinish = 50 + (int) (Math.random() * 201);

    // Recursos compartidos
    private static final Object taladro = new Object();
    private static final Object destornillador = new Object();
    private static final Object alicates = new Object();

    public Herramientas(String agente) {
        this.agente = agente;
    }

    public void run() {
        startJob();
    }

    public void startJob() {
        switch (this.agente) {
            case "A":
                usarTaladro();
                usarDestornillador();
                break;
            case "B":
                usarDestornillador();
                usarAlicates();
                break;
            case "C":
                usarTaladro();
                usarAlicates();
                usarDestornillador();
                break;
        }
    }

    private void usarDestornillador() {
        synchronized (destornillador) {
            try {
                System.out.println(agente + " empieza a usar destornillador");
                Thread.sleep(timeToFinish);
                System.out.println(agente + " termina de usar destornillador");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void usarAlicates() {
        synchronized (alicates) {
            try {
                System.out.println(agente + " empieza a usar alicates");
                Thread.sleep(timeToFinish);
                System.out.println(agente + " termina de usar alicates");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void usarTaladro() {
        synchronized (taladro) {
            try {
                System.out.println(agente + " empieza a usar taladro");
                Thread.sleep(timeToFinish);
                System.out.println(agente + " termina de usar taladro");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
