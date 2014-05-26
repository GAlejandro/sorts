/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gus_958
 */
public class Sorts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        

        Ord o = new Ord();
        merge m = new merge();
        heapsort h = new heapsort();
        quicksort q = new quicksort();        
        int limite = 0;        
        long time_start, time_end;
        int opcion = 0;
        Random r = new Random(); 
        
        System.out.println("Introduzca el limite: ");
        limite = in.nextInt();
        
        System.out.println("Introduzca 1 burbuja, 2 insertion, 3 selection,"
                + "4 radix, 5 merge, 6 heapsort, 7 quicksort,"
                + "8 todos: ");
        opcion = in.nextInt();
        
        int list[] = new int[limite];
        
        for(int i = 0; i < limite; i++){
            list[i] = r.nextInt(limite);            
        }
        
        if(opcion == 1){
            time_start = System.nanoTime()/1000;
            o.bubbleSort(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("burbuja: " + (time_end - time_start) + " microsegundos");
        }
        
        if(opcion == 2){
            time_start = System.nanoTime()/1000;
            o.insertionSort(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("insertion: " + (time_end - time_start) + " microsegundos");
        }
        
        if(opcion == 3){
            time_start = System.nanoTime()/1000;
            o.selectionSort(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("selection: " + (time_end - time_start) + " microsegundos");
        }
        
        if(opcion == 4){
            time_start = System.nanoTime()/1000;
            o.radixSort(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("radix: " + (time_end - time_start) + " microsegundos");
        }
        
        if(opcion == 5){
            time_start = System.nanoTime()/1000;
            m.mergeSort(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("merge: " + (time_end - time_start) + " microsegundos");
        }
        
        if(opcion == 6){
            time_start = System.nanoTime()/1000;
            h.HEAP_SORT(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("heapsort: " + (time_end - time_start) + " microsegundos");
        }
        
        if(opcion == 7){
            time_start = System.nanoTime()/1000;
            q.quickSort(list, 0, (limite-1));
            time_end = System.nanoTime()/1000;    
            System.out.println("quicksort: " + (time_end - time_start) + " microsegundos");
        }
        
        if(opcion == 8){
            
            time_start = System.nanoTime()/1000;
            o.bubbleSort(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("burbuja: " + (time_end - time_start) + " microsegundos");
            
            time_start = System.nanoTime()/1000;
            o.insertionSort(list);
            time_end = System.nanoTime()/1000;              
            System.out.println("insertion: " + (time_end - time_start) + " microsegundos");
            
            time_start = System.nanoTime()/1000;
            o.selectionSort(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("selection: " + (time_end - time_start) + " microsegundos");

            time_start = System.nanoTime()/1000;
            o.radixSort(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("radix: " + (time_end - time_start) + " microsegundos");
 
            time_start = System.nanoTime()/1000;
            m.mergeSort(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("merge: " + (time_end - time_start) + " microsegundos");
    
            time_start = System.nanoTime()/1000;
            h.HEAP_SORT(list);
            time_end = System.nanoTime()/1000;    
            System.out.println("heapsort: " + (time_end - time_start) + " microsegundos");
    
            time_start = System.nanoTime()/1000;
            q.quickSort(list, 0, (limite-1));
            time_end = System.nanoTime()/1000;    
            System.out.println("quicksort: " + (time_end - time_start) + " microsegundos");
            
            
        }
        
    }
    
}
