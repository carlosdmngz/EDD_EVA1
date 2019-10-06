public class Principal {

    public static void main(String[] args) {
       //DECLARAR ARREGLOS
       int aiDatos[] = new int [10];
       //N --> NUMERO DE ELEMENTOS
       //0 --> PRIMER ELEMENTO
       //N-1 --> ULTIMO ELEMENTO
       System.out.println(aiDatos);
       for(int i = 0; i < aiDatos.length; i++){
           aiDatos[i] = (int)(Math.random() * 100) + 1;
       }
        System.out.println("For normal");
       for(int i = 0; i < aiDatos.length; i++){
           System.out.println(aiDatos[i]);
       }
       //FOR-EACH
        System.out.println("For each");
        for (int x : aiDatos) {
            System.out.println(x);
        }
    }
    
}
