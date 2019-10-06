public class Principal {

    public static void main(String[] args) {
        
        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];
        //LLENAR CON VALORES ALEATORIOS
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("DATOS ORIGINALES");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("[" + aiDatos[i] + "]");
        }
        System.out.println("\n" + aiDatos);
        aiCopia = aiDatos;
        System.out.println(aiCopia);
        System.out.println("\nDATOS COPIADOS");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.print("[" + aiCopia[i] + "]");
        }
        
    }
    
}
