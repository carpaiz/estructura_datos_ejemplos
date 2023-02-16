/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBusqueda;

import java.util.Hashtable;
import java.util.Enumeration;

/**
 *
 * @author USUARIO
 */
public class AnalizadorExpresionesV2 {
    
    static Hashtable  contenedor = new Hashtable();
    static Hashtable  tablaSimbolos = new Hashtable();
//Nos vamos a ayudar del método .put() para insertar elementos dentro de la Hashtable Java:
    
    //"a + b"
    //Donde a y b son numeros enteros y + es el signo suma
    public static void main(String[] args) {
        String ExpresionEntrada = "5 + 6";
        
        String arreglo[] = ExpresionEntrada.split(" ");
        
        System.out.println("Descomponiendo la expresión...");
        for(int i = 0; i < arreglo.length; i++)
        {
            arreglo[i] = arreglo[i].trim();
            System.out.println(arreglo[i]);
            
            
            if(EsEntero(arreglo[i]))
                tablaSimbolos.put(arreglo[i], "NUMERO_ENTERO");
            else if(arreglo[i].equals("+"))
                tablaSimbolos.put(arreglo[i], "SUMA");
            else
                tablaSimbolos.put(arreglo[i], "DESCONOCIDO");
        }
            
        
        //IniciarTabla();
        MostrarTabla(tablaSimbolos);
        Buscar("+", tablaSimbolos);
    }
    
    public static boolean EsEntero(String v)
    {
        boolean esEntero = false;
        try {
           Integer.parseInt(v);
            esEntero = true;
        } catch (Exception e) {
            esEntero = false;
        }
        return esEntero;
    }
    public static void IniciarTabla()
    {
        contenedor.put("101", "Harry");
        contenedor.put("102", "Potter");
        contenedor.put("103", "IRONMAN");
        contenedor.put("104", "IRONMAN");
        contenedor.put("105", "HALLO");
    }
    
    public static void MostrarTabla(Hashtable hashTable)
    {
        Enumeration enumeration = hashTable.elements();
        while (enumeration.hasMoreElements()) 
            System.out.println(""+"hashtable valores: " + enumeration.nextElement());
    }
    
    public static void Buscar(String key, Hashtable hashTable)
    {
        String valor = hashTable.get(key).toString();
        System.out.println("El valor de la clave " + key + " es: " + valor);
        //Enumeration enumeration = contenedor.elements();
        //while (enumeration.hasMoreElements()) 
        //    System.out.println(""+"hashtable valores: " + enumeration.nextElement());
    }
    
}
