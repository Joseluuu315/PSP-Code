package com.joseluu.psp.hilo;

public class InfoHilo {

    public static void main(String[] args) {

        // Obtener el hilo actual
        Thread hiloActual = Thread.currentThread();

        // Mostrar información del hilo
        System.out.println("Nombre del hilo: " + hiloActual.getName());
        System.out.println("ID del hilo: " + hiloActual.getId());
        System.out.println("Prioridad: " + hiloActual.getPriority());
        System.out.println("Estado: " + hiloActual.getState());
        System.out.println("Grupo del hilo: " + hiloActual.getThreadGroup().getName());
    }
}
