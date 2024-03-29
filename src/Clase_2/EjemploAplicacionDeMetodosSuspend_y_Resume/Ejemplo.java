package Clase_2.EjemploAplicacionDeMetodosSuspend_y_Resume;

public class Ejemplo {
    Thread elThread = new Thread();
    public void ConfirmaCancelacion(Thread elThread) {
        elThread.suspend();
        if (DebeCancelarse("Realmente se cancela?"))
            elThread.interrupt();
        else
            elThread.resume();
    }

    private boolean DebeCancelarse(String s) {
        return true;
    }
}
