package condicionales;
import java.util.Scanner;

public class condicionWhile {
    //  Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

    // Incrementar el valor de la variable en uno cada vez que se ejecute.

    // Mostrarlo por pantalla cada vez que se ejecute.
    public static void main(String[] args) {
        System.out.println("Ejercicio while");
        double numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        System.out.println("Resultado DoWhile");
        double numeroDoWhile = 3;
        do{
            numeroDoWhile ++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile < 3);

        // Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        System.out.println("Resultado For");
        for(int numeroFor = 0; numeroFor <=3; numeroFor ++){
            System.out.println(numeroFor);
        }

        // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        //  Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
        // También habrá que poner un default para cuando el valor de la variable no sea una estación.
        System.out.println("Ingresa una estacion del año");
        Scanner lectura = new Scanner(System.in);
        String estacion = lectura.nextLine().toLowerCase();

        switch(estacion){
            case "invierno":
            System.out.println("Es invierno");
            break;
            case "verano":
            System.out.println("Es verano");
            break;
            case"primavera":
            System.out.println("Es primavera");
            break;
            case "otoño":
            System.out.println("Es otoño");
            break;
            default:
            System.out.println("Lo siento! no es una estacion");
        }
        lectura.close();
    }
}
