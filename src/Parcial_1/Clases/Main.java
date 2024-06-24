package Parcial_1.Clases;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear procesos
        Proceso proceso1 = new Proceso("listo",1,1,3);
        Proceso proceso2 = new Proceso("listo",2,2,5);
        Proceso proceso3 = new Proceso("listo",3,3,2);
        Proceso proceso4 = new Proceso("listo",4,4,4);
        Proceso proceso5 = new Proceso("listo",5,5,2);
        Proceso proceso6 = new Proceso("listo",6,6,3);

        // Crear lista de procesos
        List<Proceso> listaProcesos = new ArrayList<>();
        listaProcesos.add(proceso1);
        listaProcesos.add(proceso2);
        listaProcesos.add(proceso3);

        // Crear simulador con Semaforo
        Simulador simuladorSemaforo = new Simulador(new Semaforo(1));
        simuladorSemaforo.setListaProcesos(listaProcesos);

        // Crear simulador con Monitor
        Simulador simuladorMonitor = new Simulador(new Monitor());
        simuladorMonitor.setListaProcesos(listaProcesos);

        // Crear simulador con Algoritmo de Aguilera
        Simulador simuladorAguilera = new Simulador(new AlgoritmoAguilera());
        simuladorAguilera.setListaProcesos(listaProcesos);

        // Crear lista de procesos adicionales
        List<Proceso> listaProcesosAdicionales = new ArrayList<>();
        listaProcesosAdicionales.add(proceso4);
        listaProcesosAdicionales.add(proceso5);
        listaProcesosAdicionales.add(proceso6);

        // Crear simuladores adicionales con diferentes algoritmos
        Simulador simuladorFausti = new Simulador(new AlgoritmoFausti());
        Simulador simuladorFernandez = new Simulador(new AlgoritmoFernandez());
        Simulador simuladorOrihuela = new Simulador(new AlgoritmoOrihuela());
        Simulador simuladorRiveros = new Simulador(new AlgoritmoRiveros());
        Simulador simuladorRusticcini = new Simulador(new AlgoritmoRusticcini());

        // Agregar procesos adicionales a los simuladores adicionales
        simuladorFausti.setListaProcesos(listaProcesosAdicionales);
        simuladorFernandez.setListaProcesos(listaProcesosAdicionales);
        simuladorOrihuela.setListaProcesos(listaProcesosAdicionales);
        simuladorRiveros.setListaProcesos(listaProcesosAdicionales);
        simuladorRusticcini.setListaProcesos(listaProcesosAdicionales);

        // Iniciar simulación en los simuladores
        simuladorSemaforo.iniciarSimulacion();
        simuladorMonitor.iniciarSimulacion();
        simuladorAguilera.iniciarSimulacion();
        simuladorFausti.iniciarSimulacion();
        simuladorFernandez.iniciarSimulacion();
        simuladorOrihuela.iniciarSimulacion();
        simuladorRiveros.iniciarSimulacion();
        simuladorRusticcini.iniciarSimulacion();

        // Obtener resultados de cada simulador
        System.out.println("\nResultados del simulador con Algoritmo de Aguilera:");
        simuladorAguilera.getAlgoritmo().obtenerResultados();

        System.out.println("\nResultados del simulador con Algoritmo de Fausti:");
        simuladorFausti.getAlgoritmo().obtenerResultados();

        System.out.println("\nResultados del simulador con Algoritmo de Fernandez:");
        simuladorFernandez.getAlgoritmo().obtenerResultados();

        System.out.println("\nResultados del simulador con Algoritmo de Orihuela:");
        simuladorOrihuela.getAlgoritmo().obtenerResultados();

        System.out.println("\nResultados del simulador con Algoritmo de Riveros:");
        simuladorRiveros.getAlgoritmo().obtenerResultados();

        System.out.println("\nResultados del simulador con Algoritmo de Rusticcini:");
        simuladorRusticcini.getAlgoritmo().obtenerResultados();
    }
}
