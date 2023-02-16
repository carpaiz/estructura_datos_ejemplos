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
public class AnalizadorExpresionesV1 {
    
    static Hashtable  contenedor = new Hashtable();
//Nos vamos a ayudar del método .put() para insertar elementos dentro de la Hashtable Java:

    public static void main(String[] args) {
        IniciarTabla();
        MostrarTabla();
        Buscar("101");
    }
    
    public static void IniciarTabla()
    {
        contenedor.put("101", "Harry");
        contenedor.put("102", "Potter");
        contenedor.put("103", "IRONMAN");
        contenedor.put("104", "IRONMAN");
        contenedor.put("105", "HALLO");
    }
    
    public static void MostrarTabla()
    {
        Enumeration enumeration = contenedor.elements();
        while (enumeration.hasMoreElements()) 
            System.out.println(""+"hashtable valores: " + enumeration.nextElement());
    }
    
    public static void Buscar(String key)
    {
        String valor = contenedor.get(key).toString();
        System.out.println("El valor de la clave " + key + " es: " + valor);
        //Enumeration enumeration = contenedor.elements();
        //while (enumeration.hasMoreElements()) 
        //    System.out.println(""+"hashtable valores: " + enumeration.nextElement());
    }
    
}
