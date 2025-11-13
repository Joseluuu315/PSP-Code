package com.joseluu.psp.herramientas;

public class Herramientas extends Thread{
    private final String agente;
    int timeToFinish = 50 + (int) (Math.random() * 201);

    public Herramientas(String agente){
        this.agente = agente;
    }

    public String getAgente(){
        return this.agente;
    }

    public void run(){
        switch (this.agente){
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

    public synchronized void usarDestornillador(){

        try {
            System.out.println("Start with " + getAgente() + " " + Thread.currentThread().getName());
            Thread.sleep(timeToFinish);
            System.out.println("Finish with " + getAgente() + " " + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public synchronized void usarAlicates(){


        try {
            System.out.println("Start with " + getAgente() + " " + Thread.currentThread().getName());
            Thread.sleep(timeToFinish);
            System.out.println("Finish with " + getAgente() + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public synchronized void usarTaladro(){

        try {
            System.out.println("Start with " + getAgente() + " " + Thread.currentThread().getName());
            Thread.sleep(timeToFinish);
            System.out.println("Finish with " + getAgente() + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
