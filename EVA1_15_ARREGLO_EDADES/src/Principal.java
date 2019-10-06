
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.println("Teclea el numero de edades");
        int N = s.nextInt();
        Edad aEdad[] = new Edad[N];
      
        for (int i = 0; i < aEdad.length; i++) {
            aEdad[i] = new Edad();
            System.out.println("Introducir edad " +(i+1));
            aEdad[i].edad = s.nextInt();
        }
        ImprimirA(aEdad);
        MediaA(aEdad);
    }
    public static void ImprimirA(Edad [] args){
                for (int i = 0; i < args.length; i++) {
            System.out.println("Edad " +(i+1)+ ":" +args[i].edad);
        }
    }
    public static void MediaA(Edad [] args){
        int pm = 0;
        for (int i = 0; i < args.length; i++) {
            pm = args[i].edad + args[i].edad;
        }
        float P = pm/args.length;
        System.out.println("La media es de " +P);
    }
    public static void Moda(Edad[] args) {
        int pmoda = 0;
        for (int i = 0; i < args.length; i++) {
           if (args[i].edad == (i+1)){
               pmoda += 1;
           } 
        }
        System.out.println("La moda es de " );
    }
    
}
class Edad { 
    int edad;
}
