/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dzlan
 */
public class Quicksort {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de datos ");
        int n = sc.nextInt();
        int []v= new int[n];
        generar(v);     
        mostrar(v);
        System.out.println("Elementos ordenados: ");
        quick(0, (v.length-1), v);
       
        mostrar(v);
    }
        
    
    
        private static void quick(int primero, int ultimo, int[] v){
            int i=primero;
            int j=ultimo;
            int central=v[(primero+ultimo)/2]; //pivote
            
            do {
                // Mueve "i" hacia la derecha hasta encontrar un valor mayor o igual al pivote
               while (central>v[i]){
                   i++;
                   
               }
          
               // Mueve "j" hacia la izquierda hasta encontrar un valor menor o igual al pivote
             while (central<v[j]){
                 j--;
                 
             }
               // Si 'i' está a la izquierda de 'j', intercambia los elementos
                 if (i<=j){
                  int temp=v[i];
                   v[i]=v[j];
                   v[j]= temp; 
                   i++;
                   j--;
                 }
             
            }while(i <= j); // Repite mientras 'i' no haya pasado a 'j'
            
            
           // Llama recursivamente para ordenar las dos mitades
           if(primero<j){
               quick(primero,j,v); // Ordena la parte izquierda del pivote
           }
           if (ultimo>i)
               quick(i, ultimo, v);  // Ordena la parte derecha del pivote
        }
        
        
        
        private static void mostrar (int[]v){
            System.out.println();
            for (int i = 0; i < v.length; i++){
             System.out.println(v[i]+"\t");
        }
        System.out.println();
            
        }
            
        private static void generar (int[]v){
            Random r = new Random();
          for (int i = 0; i < v.length; i++){
            v[i]=r.nextInt(20);
            
        }
         
       
    }
  
}
