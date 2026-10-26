import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int num = lector.nextInt();
        String binario = "";
        String octal = "";
        String hexa = "";
        int base = 0;
        do {
            System.out.printf("A qué base quieres transformarlo? \n");
             base = lector.nextInt();
        }while (base != 2 && base != 8 && base!= 16);
        if (base == 2){
        do {
            if (num % 2 == 0) {
                binario = "0" + binario;
            }else  {
                binario = "1" + binario;
            }
            num = num/2;
        }while (num > 0);
            System.out.println("El numero en base binaria es " +binario);
        } else if (base==8) {
            do {
                octal = (num % 8) + octal;
                num = num / 8;
            } while (num > 0) ;
            System.out.println("El numero en base octal es " +octal);

        }else{
            do {
                int resto = num % 16;
                switch (resto){
                case 10: hexa = "A" + hexa; break;
                case 11: hexa = "B" + hexa; break;
                case 12: hexa = "C" + hexa; break;
                case 13: hexa = "D" + hexa; break;
                case 14: hexa = "E" + hexa; break;
                case 15: hexa = "F" + hexa; break;
                default: hexa = resto + hexa;
                }
                num = num / 16;
            } while (num > 0);
            System.out.println("El numero en base hexxadecimal es " +hexa);

        }
        lector.close();

    }

}

