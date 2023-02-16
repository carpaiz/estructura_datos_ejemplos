/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosBusqueda;

import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class TablasHaHaHash {

    String[] arreglo;
    int tamanio, contador;
    
    public TablasHaHaHash(int tam){
        tamanio = tam;
        arreglo = new String[tam];
        Arrays.fill(arreglo, "-1");
                   //|0| -  |1| - |2| - |3| - |4| - |5| - |6| - |7|
        //arreglo = {"21", "-1", "-1", "10", "-1", "33", "20", "-1"};
    }
    
    public void FuncionHash(String[] cadenaArreglo, String[] arreglo){
        int i;
        //String[] elementos = {"20 - LISTO - POS6", "33 - LISTO - POS6", "21 - LISTO - POS0", "10", "12", "14", "56", "100"};
        for(i = 0; i < cadenaArreglo.length; i++){
            String elemento = cadenaArreglo[i];//12
            int indiceArreglo = Integer.parseInt(elemento) % 7;
            //int indiceArreglo = 12 % 7 = 5
            System.out.println("El índice es: " + indiceArreglo + " para el elemento o valor: " + elemento);
            
            //GESTIÓN DE COLISIONES
            while(arreglo[indiceArreglo] != "-1"){
                indiceArreglo++;
                //7
                System.out.println("Ocurrió una colisión en el índice" +
                        (indiceArreglo - 1) + ", cambiar al índice " +
                        indiceArreglo);
                
                //indiceArreglo mod tamanio = 7 mod 7 = 6
                indiceArreglo %= tamanio;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }
    
    public void MostrarTabla(){
        int incremento = 0, i, j;
        for(i = 0; i < 1; i++)
        {
            incremento += 8;
            for(j = 0; j < 71; j++)
                System.out.print("-");
            System.out.println();
            
            for(j = incremento - 8; j < incremento; j++)
                System.out.format("| %3s " + " ", j);
            System.out.println("|");
            
            for(int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();
            
            for(j = incremento - 8; j < incremento; j++){
                if(arreglo[j].equals("-1")) System.out.print("|     ");
                else 
                    System.out.format("| %3s " + " " , arreglo[j].toString()); 
            }
            
            System.out.println("|");
            
            for(j = 0; j < 71; j++)
                System.out.print("-");
            System.out.println();
        }
    }
    
    public String BuscarClave(String elemento){
        int indiceArreglo = Integer.parseInt(elemento) % 7;
        //33%7=5
        int contador = 0;
        
        while(arreglo[indiceArreglo] != "-1"){
            if(arreglo[indiceArreglo] == elemento){
                System.out.println("El elemento " + elemento +
                        " fue encontrado en el índice " + indiceArreglo);
                
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo%=tamanio;
            contador++;
            if(contador > 7){
                break;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        TablasHaHaHash tHash = new TablasHaHaHash(8);
        String[] elementos = {"20", "33", "21", "10", "12", "14", "56", "100"};
        
        tHash.FuncionHash(elementos, tHash.arreglo);
        tHash.MostrarTabla();
        String buscado = tHash.BuscarClave("14");
        
        if(buscado == null)
            System.out.println("El elemento 14 no se encuentra en la tabla");
    }
}
