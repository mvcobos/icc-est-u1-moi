public class MetodoOrdenamiento {
    public int[] sortInsercion(int[] arreglo){
        for(int i = 1; i < arreglo.length; i++){
            int aux = arreglo[i];
            int j = i - 1;
            while(j >= 0 &&arreglo[j] > aux ){
                arreglo [j + 1] = arreglo[j];
                j--;
            }
            arreglo[j+1] = aux;
        }
        return arreglo;
    }

    public void printInsercion(int[] arreglo){
        for(int elemento : arreglo){
            System.out.print(elemento + ", ");
        }
    }
}
