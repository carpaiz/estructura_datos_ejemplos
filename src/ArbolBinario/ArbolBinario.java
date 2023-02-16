
package ArbolBinario;

public class ArbolBinario {
    
    Nodo raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    
    public void insertar(int i, String contenido){
        Nodo n = new Nodo(i);
        n.valor = contenido;
        
        //INICIALIZANDO LA RAÍZ DEL ÁRBOL
        if(raiz == null)
            raiz = n;
        else{
            //RECORRIENDO EL ARBOL
            Nodo aux = raiz;
            while(aux != null){
                n.padre = aux;
                
                if(n.llave >= aux.llave)
                    aux = aux.derecha;
                else
                    aux = aux.izquierda;
            }
            
            //INSERCIÓN DEL NUEVO NODO
            if(n.llave < n.padre.llave)
                n.padre.izquierda = n;
            else
                n.padre.derecha = n;        
        }
    }
    
    public void recorrer(Nodo n){
        if(n != null)
        {
            recorrer(n.izquierda);
            System.out.println("Indice: " + n.llave + ", Valor: " + n.valor);
            recorrer(n.derecha);
        }
    }
    
    //1. Interfaz gráfica para agregar nodos mediante una interfaz de usuario que solicite:
    //una llave y su respectivo valor y despliegue automáticamente el recorrido con el nuevo nodo agregado
    
    //2. Programar un método de búsqueda, que reciba como parámetro una llave y devuelva el valor que
    //se encuentra almacenado en el nodo (si es que este existe).
    
    //3. Implementar dicho método en la interfaz gráfica.
    //Agregar una sección de búsqueda, que solicitará una llave, realizará el recorrido hasta encontrar el nodo
    //coincidente con la llave ingresada y entonces, desplegará el valor almacenado en dicho nodo.
    
    
    private class Nodo{
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public String valor;
        
        public Nodo(int indice){
            padre = null;
            derecha = null;
            izquierda = null;
            llave = indice;
            valor = null;
        }
    }
}
