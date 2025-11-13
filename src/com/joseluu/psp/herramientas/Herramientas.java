package com.joseluu.psp.herramientas;

public class Herramientas extends Thread{



    public synchronized void usarDestornillador(){
        int timeToFinish = 50 + (int) (Math.random() * 201);

        try {
            Thread.sleep(timeToFinish);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public synchronized void usarAlicates(){
        int timeToFinish = 50 + (int) (Math.random() * 201);

        try {
            Thread.sleep(timeToFinish);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public synchronized void usarTaladro(){
        int timeToFinish = 50 + (int) (Math.random() * 201);

        try {
            Thread.sleep(timeToFinish);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
