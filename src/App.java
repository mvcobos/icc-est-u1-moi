public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento ordenar = new MetodoOrdenamiento();
        int[] arreglo = {48, 2, 8, 27, 12};
        int[] arregloInsercion = ordenar.sortInsercion(arreglo, false);
        ordenar.printInsercion(arregloInsercion);
    }
}
