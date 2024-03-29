package Clase_2.DelegacionEnOperacionCostosaEnUnThread;

public class threadAgente{
    public static void operacionCostosa(){}
     public static void main(String[] args) {
        // Lanza la ejecución costosa en un thread anónimo concurrente
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        operacionCostosa();
                    }
                }).start();
            //main ejecuta concurrentemente otra tarea de interés
    }
}
