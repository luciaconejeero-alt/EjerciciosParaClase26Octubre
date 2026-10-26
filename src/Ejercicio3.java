import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int base =0;

        do {
            System.out.println("Introduce la base(2, 8, 16):");
            base = lector.nextInt();
            if (base != 2 && base != 8 && base != 16){
                System.out.println("Base errónea por favor prueba de nuevo.");
            }

        }while(base != 2 && base != 8 && base != 16);

        String nombreBase = "";
        switch (base){
            case 2 :
                nombreBase = "binario";
                break;
            case 8 :
                nombreBase = "octal";
                break;
            case 16:
                nombreBase = "hexadecimal";
                break;

        }

        System.out.println("Introduce el número en "+ nombreBase);
        String numero = lector.next();

        int decimal = 0;
        boolean valido = true;

        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            int digito;

            if (c >= '0' && c <= '9'){
                digito = c - '0';
            } else if (c >='A' && c<= 'F') {
                digito = c - 'A' + 10;
            } else {
                digito = -1;
            }
            if (digito < 0 && digito >= base){
                valido = false;
            }

            decimal = decimal * base + digito;
        }
        if (valido){
            System.out.println(numero + " en " + nombreBase + " = " + decimal + " en decimal");

        }else {
            System.out.println("El número " + numero + " no es válido en base " + base);

        }



        lector.close();
    }
}
