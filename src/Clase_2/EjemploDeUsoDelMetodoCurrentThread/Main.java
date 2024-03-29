package Clase_2.EjemploDeUsoDelMetodoCurrentThread;
public class Main {
    public static void main(String[] args){
        Cliente juan= new Cliente();
        juan.setName("Juan López");

        Cliente ines= new Cliente();
        ines.setName("Inés García");

        juan.start();
        ines.start();
    }
}

