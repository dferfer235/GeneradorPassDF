package generadorpassworddf;

import java.util.Random;

public class GeneradorDF {

    //Condiciones de la contraseña
    //4 numeros distintos del 0 al 9
    //La suma de los digitos 1 y 4 son inpares
    //La multiplicacion de los digitos 2 y 3 es par
    //Una letra aleatoria entre F-x
    public static void main(String[] args) {
        int n1 = 0, n2, n3, n4 = 0;
        int suma, multiplicacion;
        char letra;

        Random numAleatorio = new Random();

        do {
            letra = (char) (numAleatorio.nextInt(88 - 70 + 1) + 70);
            n1 = numAleatorio.nextInt(10);
            n2 = numAleatorio.nextInt(10);
            n3 = numAleatorio.nextInt(10);
            n4 = numAleatorio.nextInt(10);
            System.out.println("Probando: " + n1 + n2 + n3 + n4 + letra);

            suma = n1 + n4;
            if (suma % 2 != 1) {
                n1 = n4;
                continue;
            }

            multiplicacion = n2 * n3;
            if (multiplicacion % 2 != 0) {
                n2 = n3;
            }

        } while (n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4 || n3 == n4);

        System.out.println("Se ha encontrado una contraseña valida");
        System.out.println("------------------------------");
        System.out.println("Tu contraseña es: " + n1 + n2 + n3 + n4 + letra);
    }

}
