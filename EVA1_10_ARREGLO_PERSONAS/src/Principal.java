import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
       String aiPersona[] = new String[10];
       Scanner p = new Scanner(System.in);
       Persona p1 = new Persona();
        for (int i = 0; i < aiPersona.length; i++) {
            System.out.println("Teclear el nombre");
       p1.nombre=p.nextLine();
            System.out.println("Teclear apellido");
       p1.apellido=p.nextLine();
       
       aiPersona[i]=p1.nombre+" "+p1.apellido;
       
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            System.out.println("["+aiPersona[i]+"]");
 
        }
        
    }

    }
    class Persona{
        String nombre;
        String apellido;

}

