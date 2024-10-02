import java.util.Arrays;

public class MetodoOrdenamiento {
    public int[] sortInsercion(int[] arreglo, boolean logs){
        if(logs){
            for(int i = 1; i < arreglo.length; i++){
                System.out.println("Iteracion numero " + i);
                int aux = arreglo[i];
                int j = i - 1;
                System.out.println("\ti=" + i + " j=" + j + " [i]=" + arreglo[i] + " [j]=" + arreglo[j]);
                while(j >= 0 && arreglo[j] > aux ){
                    System.out.println("\t\tComparamos " + aux + " con " + arreglo[j]);
                    arreglo [j + 1] = arreglo[j];
                    j--;
                    System.out.println("\t\t--------" + Arrays.toString(arreglo));
                }
                arreglo[j+1] = aux;
                System.out.println("\t--------" + Arrays.toString(arreglo));
            }
        } else {
            for(int i = 1; i < arreglo.length; i++){
                int aux = arreglo[i];
                int j = i - 1;
                while(j >= 0 && arreglo[j] > aux ){
                    arreglo [j + 1] = arreglo[j];
                    j--;
                }
                arreglo[j+1] = aux;
            }
        }
        return arreglo;
    }

    public void printInsercion(int[] arreglo){
        for(int elemento : arreglo){
            System.out.print(elemento + ", ");
        }
    }
}
