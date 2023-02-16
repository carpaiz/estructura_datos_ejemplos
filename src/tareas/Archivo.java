/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author carpaiz
 */

public class Archivo {
    //static int tam = 1000000; // 1 millon
       static int tam = 100000000;// 100 millones
    public static String Generar() throws IOException {
        
        HashSet<Integer> lista_numeros = new HashSet<>();
        while(lista_numeros.size()<tam)
        {
            int random = ThreadLocalRandom.current().nextInt(-10000000,10000000+1);
            lista_numeros.add(random);
            //System.out.println(lista_numeros.iterator());
        }
        //System.out.println("Hay: "+lista_numeros.size()+" numeros en el array");
        
        String fichero = "numeros_hs.txt";
 
        try {
            File archivo= new File(fichero);
            FileWriter escribir= new FileWriter(archivo,true);
            PrintWriter imprimir=new PrintWriter(escribir);   
            imprimir.print(lista_numeros);
            imprimir.close();
            //System.out.println("Numeros generados correctamente...");
            return "Numeros generados correctamente...Tabla hash";
        } catch (FileNotFoundException ex) {
            System.out.println("Error: El fichero no existe. ");
            return ex.getMessage();
        }
 
    }
    public static String Generar_2() throws IOException {
        int[] lista_numeros = new int[tam];
        int i = 0;
        while (i < lista_numeros.length) {
             int random = ThreadLocalRandom.current().nextInt(-10000000,10000000+1);
           
             lista_numeros[i] = random; // Llena el array con números aleatorios del 0 al 99
           //System.out.println(lista_numeros[i]);
             i++;
        }
        
        
        //System.out.println("Hay: "+lista_numeros.size()+" numeros en el array");
        
        String fichero = "numeros_arr.txt";
 
        try {
            File archivo= new File(fichero);
            FileWriter escribir= new FileWriter(archivo,true);
            PrintWriter imprimir=new PrintWriter(escribir); 
            for (int j = 0; j < lista_numeros.length; j++) {
            imprimir.print(lista_numeros[j]);
            }
            
            imprimir.close();
            //System.out.println("Numeros generados correctamente...");
            return "Numeros generados correctamente...Array";
        } catch (FileNotFoundException ex) {
            System.out.println("Error: El fichero no existe. ");
            return ex.getMessage();
        }
 
    }
    public static String Generar_3() throws IOException {
        
       ArrayList<Integer> lista_numeros = new ArrayList<>();
        while(lista_numeros.size()<tam)
        {
            int random = ThreadLocalRandom.current().nextInt(-10000000,10000000+1);
            lista_numeros.add(random);
            //System.out.println(lista_numeros);
        }
        //System.out.println("Hay: "+lista_numeros.size()+" numeros en el array");
        
        String fichero = "numeros_arrl.txt";
 
        try {
            File archivo= new File(fichero);
            FileWriter escribir= new FileWriter(archivo,true);
            PrintWriter imprimir=new PrintWriter(escribir);   
            //imprimir.print(lista_numeros);
            for (int j = 0; j < lista_numeros.size(); j++) {
            imprimir.print(lista_numeros.get(j));
            }
            imprimir.close();
            //System.out.println("Numeros generados correctamente...");
            return "Numeros generados correctamente...Array List";
        } catch (FileNotFoundException ex) {
            System.out.println("Error: El fichero no existe. ");
            return ex.getMessage();
        }
 
    }
    
    public static String Ordenar() throws IOException{
        
        File archivo = new File("Ordenados.txt");
        archivo.createNewFile();
        
        ArrayList<String> lineas = new ArrayList<>();
        Scanner leer = new Scanner(new File("numeros.txt")).useDelimiter(",");
        while(leer.hasNext())
        {
            lineas.add(leer.next());
        }

        ArrayList<Integer> resultado = Pasar_Arr_Int(lineas);
        Collections.sort(resultado);
        //ArrayList<Integer> ordenado = burbuja(resultado);
        //List<Integer> listOfInteger = lineas.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());

        FileWriter escribir = new FileWriter(archivo);
        PrintWriter imprimir=new PrintWriter(escribir);   
        imprimir.print(resultado);
        imprimir.close();
        return "Numeros Ordenados Exitosamente...";
    }
    
    public static ArrayList<Integer> Pasar_Arr_Int(ArrayList<String>numeros){
        ArrayList<Integer> Convertir = new ArrayList<Integer>();
        for(String stringValue : numeros){
            try{
                Convertir.add(Integer.parseInt(stringValue.trim()));
            }catch (Exception ex) {
            }
        }
        return Convertir;
    }
    
    
    public static ArrayList<Integer> burbuja(ArrayList<Integer> arreglo)
    {
      int auxiliar;
      ArrayList<Integer> arregloOrdenado = new ArrayList<>();
      for(int i = 1; i < arreglo.size(); i++)
      {
        for(int j = 0;j < arreglo.size()-i;j++)
        {
          if(arreglo.get(j) > arreglo.get(j+1))
          {
            auxiliar = arreglo.get(j);
            arreglo.set(j, arreglo.get(j+1));
            arreglo.set(j+1,  auxiliar);
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
}
