public class BusquedaBinaria {
    
    public static int busquedaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fin = array.length - 1;
        
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            
            if (array[medio] == elemento) {
                return medio;
            } else if (array[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        
        return -1;
    }
}
