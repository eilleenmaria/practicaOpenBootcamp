public class coche {
    int numPuertas = 0;
    public static void main(String[] args) {
        coche miCoche= new coche();
        miCoche.masPuerta();
        miCoche.masPuerta();
        System.out.println(miCoche.numPuertas);
    }

    public void masPuerta( ){
        numPuertas++;
    }
}
