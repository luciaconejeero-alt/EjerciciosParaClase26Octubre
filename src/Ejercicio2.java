import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        int saldo = 1000;
        System.out.println("-- CAJERO AUTOMÁTICO ---");
        System.out.println("Saldo inicial: "+ saldo);
        do {
            System.out.printf("--- MENÚ ---\n1. Consultar saldo\n2. Retirar dinero\n3. Depositar dinero\n4. Salir\n");
            System.out.println("Elige una opción: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo actual es de: "+saldo);
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar?");
                    int retirar = lector.nextInt();
                    if (retirar > saldo){
                        System.out.println("Fondos insuficientes. Tu saldo es de "+ saldo);
                    }else {
                        saldo = saldo - retirar;
                        System.out.println("Retiro existoso. Has retirado: "+ retirar);
                        System.out.println("Tu saldo actual es de: "+ saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cuanto desea depositar?");
                    int depositar = lector.nextInt();
                    saldo = saldo + depositar;
                    System.out.println("Deposito existoso. Has depositado: "+ depositar);
                    System.out.println("Tu saldo actual es de: "+ saldo);

                    break;
            }

        }while (opcion != 4);
        System.out.println("Gracias por usar el cajero. Hasta pronto!");
        lector.close();
    }
}
