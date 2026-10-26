import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int sueldo = 0;
        int total = 0;
        int mayorMil = 0;
        double media = 0;
        int empleados = 0;
            for (int i = 1; i <= 10 ; i++) {
                System.out.printf("Bienvenido, introduzca el sueldo del empleado %d\n", i);
                sueldo = lector.nextInt();
                 total = total + sueldo;
                empleados = i;
                if (sueldo >= 1000){
                    mayorMil++;
                }
            }
            System.out.println("Total de sueldos es "+ total);
            media = (double) total / 10;
        System.out.println("La media de los sueldos es de "+ media);
        System.out.println("Hay un total de " + mayorMil + " empleados cobrando más de mil euros");



        lector.close();
    }
}
