import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y
        // lo guarde en una variable. El sistema irá pidiendo números al usuario hasta
        // que coincida con el aleatorio generado (en caso de no coincidir mostrará
        // el mensaje "Lo siento, intentalo de nuevo"). Cuando coincida el sistema
        // deberá mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos"
        // (Adivina)
        Scanner lector = new Scanner(System.in);
            int num;
            int record = 0;
            String respuesta = "";
            boolean sonIguales;
            do {
                int random = (int) (Math.random()*20)+1;
                int intentos = 0;
                do {

                    System.out.println("Introduce un numero del 0 al 20;");
                    num = lector.nextInt();
                    intentos++;
                    sonIguales = num == random;
                    if (sonIguales) {
                        System.out.printf("Enhorabuena, has acertado el número en %d intentos%n", intentos);

                    } else {
                        System.out.println("Lo siento, intentalo de nuevo");
                        System.out.println(" El numero era " + random);
                    }

                    } while (!sonIguales);

                if (record == 0){
                    record = intentos;
                    System.out.printf("Primer record establecido en %d intentos!", record);
                } else if (intentos < record) {
                    record = intentos;
                    System.out.printf("Nuevo record! %d intentos!", record);
                }else {
                    System.out.println("No has superado el récord de " + record + " intentos");
                }

                System.out.println("Quieres volver a jugar?(S/N)");
                respuesta = lector.next().toUpperCase();
            }while (respuesta.equals("S"));
        System.out.println("Hasta luego!");

        lector.close();


    }
}
