package ArbolBinario;

public class EstructuraDeDatos {


    public static void main(String[] args) {
        //System.out.println("ARBOLES BINARIOS CON JAVA");
        
        ArbolBinario arbolBinario = new ArbolBinario();
        
        arbolBinario.insertar(4, "A");
        arbolBinario.insertar(8, "B");
        arbolBinario.insertar(1, "C");
        arbolBinario.insertar(9, "D");
        arbolBinario.insertar(7, "E");
        
        arbolBinario.recorrer(arbolBinario.raiz);
        
        //arbolBinario.BuscarLlave(7);
    }
    
}
