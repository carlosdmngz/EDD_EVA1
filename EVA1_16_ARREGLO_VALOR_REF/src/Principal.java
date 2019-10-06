public class Principal {

    public static void main(String[] args) {
        int arreglo[] = new int[11]; 
        System.out.println(arreglo);
        llenarArreglo(arreglo);
        madrearArreglo(arreglo);
        System.out.println(arreglo);
        imprimirArreglo(arreglo);
        
    }
public static void llenarArreglo(int[] pariente){
    for (int i = 0; i < pariente.length; i++) {
        pariente[i]= (int)(Math.random()*100);
    }
    
}
public static void imprimirArreglo(int[] pariente){
    for (int i = 0; i < pariente.length; i++) {
        System.out.print("["+pariente[i]+"]");
    }
    System.out.println("");
}
public static void madrearArreglo(int[] pariente){
    pariente = new int[100];
    System.out.println(pariente);
    }
}
