public class Principal {

    public static void main(String[] args) {
        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < aiCopia.length; i++) {
            aiCopia[i] = aiDatos[i];
        }
        ImprimirArreglo(aiDatos);
        ImprimirArreglo(aiCopia);
        System.out.println(aiCopia + " " + aiDatos);
        aiDatos[0] = 99999;
        ImprimirArreglo(aiDatos);
        ImprimirArreglo(aiCopia);
    }
    
    public static void ImprimirArreglo(int[] aiImprimir){
        for (int i = 0; i < aiImprimir.length; i++) {
            System.out.print("["+aiImprimir[i]+"]");
        }
        System.out.println("");
    }
    
}
