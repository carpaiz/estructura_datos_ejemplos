/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Recursividad {
    
    static String strHanoi;
    public static void main(String[] args) {
     
        //RECURSIVIDAD
        //ES LA FORMA EN LA CUAL SE ESPECIFICA UN PROCESO BASADO EN SU PROPIA DEFINICIÓN
        //DIVIDIR UN PROBLEMA PERO EN INSTANCIAS MÁS SIMPLES
        //HASTA ENCONTRAR LA SOLUCIÓN EXPLÍCITA
        //LAS INSTANCIAS SIMPLES QUE TIENEN SOLUCIÓN SE CONOCEN COMO CASO BASO
        
        //LOS CASOS BASE PERMITIRÁN RESOLVER PROBLEMAS MÁS GRANDES.
        //"PARA ENTENDER LA RECURSIVIDAD PRIMER HAY QUE ENTENDER LA RECURSIVIDAD"
        
        //PROBLEMA:
        //  - CASO BASE: Respuesta explícita
        //  - DOMINIO: (PROBLEMA - 1);
        int valor = 3;
        int factorial;
        factorial = getFactorialCicloFor(valor);
        JOptionPane.showMessageDialog(null, "El factorial ITERATIVO de " + valor + " es: " + factorial);
        
        factorial = getFactorialRecursivo(valor);
        JOptionPane.showMessageDialog(null, "El factorial RECURSIVO de " + valor + " es: " + factorial);
        
        strHanoi = "";
        hanoi(3, "A", "B", "C");
        JOptionPane.showMessageDialog(null, "Torres de Hanoi: " + System.lineSeparator() + strHanoi);
        
    }
    
    public static int getFactorialCicloFor(int n){
        int acumulado = 1;
        for(int i = n; i >= 1; i--)
            acumulado *= i;
        
        return acumulado;
    }
    
    public static int getFactorialRecursivo(int n){
        if(n == 0) return 1;
        else return n * getFactorialRecursivo(n-1);   
    }
    
    public static void hanoi(int n, String origen, String auxiliar, String destino)
    {
        if(n > 0){
            hanoi(n - 1, origen, destino, auxiliar);
            System.out.println("Mover " + n + " de Torre " + origen + " a Torre " + destino);
            strHanoi += "Mover " + n + " de Torre " + origen + " a Torre " + destino + System.lineSeparator();
            hanoi(n-1, auxiliar, origen, destino);
        }
    }
    
}
