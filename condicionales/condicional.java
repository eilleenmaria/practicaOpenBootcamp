package condicionales;
import java.util.Scanner;


public class condicional {
    public static void main(String[] args) {

        // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        // Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
       
        System.out.println("Ingresa un numero");
        Scanner sc = new Scanner(System.in);
        double numeroIf = sc.nextDouble();

        if ( numeroIf < 0){
            System.out.println( numeroIf + " ,es negativo");
        }
        else if( numeroIf > 0){
            System.out.println( numeroIf + " ,es positivo");
        }
        else{
            System.out.println(numeroIf + " , es igual a cero");
        }
        sc.close();

//     Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

// Incrementar el valor de la variable en uno cada vez que se ejecute.

// Mostrarlo por pantalla cada vez que se ejecute.


    }
}

