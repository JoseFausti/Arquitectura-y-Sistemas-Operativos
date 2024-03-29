package Clase_2.EjemploDeFinalizacionPorInterruptedException;
public class Ejemplo_Fin_por_Interrupt {
    public static void main(String[] args){
        Thread elThread= new MiThread();
        elThread.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){};
        elThread.interrupt();
    }
}