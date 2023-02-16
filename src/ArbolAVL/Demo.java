
package ArbolAVL;

public class Demo {
    
    public static void main(String[] args) {
        ArbolAVL arbolAVL = new ArbolAVL();
        
        arbolAVL.insertar(10);
        arbolAVL.insertar(5);
        arbolAVL.insertar(13);
        arbolAVL.insertar(1);
        arbolAVL.insertar(6);
        arbolAVL.insertar(17);
        arbolAVL.insertar(16);
        arbolAVL.preOrden(arbolAVL.raiz);
        //System.out.println("Hola mundo...");
    }
}
