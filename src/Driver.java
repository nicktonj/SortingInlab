

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicktonjum
 * Created Fall 2017
 * This Program finds time it takes to sort with bubble sort and selection sort in an array.
 */
import java.util.Random;
public class Driver 
{
    public static void main(String[] args) 
    {
       Random rand = new Random();
       Sorting sort = new Sorting();
       double startTime;
       double endTime;
       int size20[] = new int[20];
       int size100[] = new int[100];
       int size500[] = new int[500];
       int size1000[] = new int[1000];
       int size10000[] = new int[10000];

       
       
       for(int i=0; i<size20.length; i++)
       {
           size20[i] = rand.nextInt(20) + 1;
       }

       startTime = System.currentTimeMillis();
       sort.bubbleSort(size20);
       endTime = System.currentTimeMillis();
       System.out.println("The time in milliseconds to sort 20 items using bubble sort is " + (endTime-startTime));

      
       startTime = System.currentTimeMillis();
       sort.selectionSort(size20);
       endTime = System.currentTimeMillis();
       System.out.println("The time in milliseconds to sort 20 items using selection sort is " + (endTime-startTime));

      
       
       for(int i=0; i<size100.length; i++)
       {
           size100[i] = rand.nextInt(100) + 1;
       }

       startTime = System.currentTimeMillis();
       sort.bubbleSort(size100);
       endTime = System.currentTimeMillis();
       System.out.println("The time in milliseconds to sort 100 items using bubble sort is " + (endTime-startTime));

      
       startTime = System.currentTimeMillis();
       sort.selectionSort(size100);
       endTime = System.currentTimeMillis();
       System.out.println("The time in milliseconds to sort 100 items using selection sort is " + (endTime-startTime));

       
       
       
       
       for(int i=0; i<size500.length; i++)
       {
           size500[i] = rand.nextInt(500) + 1;
       }

       startTime = System.currentTimeMillis();
       sort.bubbleSort(size500);
       endTime = System.currentTimeMillis();
       System.out.println("The time in milliseconds to sort 500 items using bubble sort is " + (endTime-startTime));

       startTime = System.currentTimeMillis();
       sort.selectionSort(size500);
       endTime = System.currentTimeMillis();
       System.out.println("The time in milliseconds to sort 500 items using selection sort is " + (endTime-startTime));

      
       
       
       for(int i=0; i<size1000.length; i++)
       {
           size1000[i] = rand.nextInt(1000) + 1;
       }

       startTime = System.currentTimeMillis();
       sort.bubbleSort(size1000);
       endTime = System.currentTimeMillis();
       System.out.println("The time in milliseconds to sort 1000 items using bubble sort is " + (endTime-startTime));

       startTime = System.currentTimeMillis();
       sort.selectionSort(size1000);
       endTime = System.currentTimeMillis();
       System.out.println("The time in milliseconds to sort 1000 items using selection sort is " + (endTime-startTime));

 
       
       
       for(int i=0; i<size10000.length; i++)
       {
           size10000[i] = rand.nextInt(10000) + 1;
       }
        
       startTime = System.currentTimeMillis();
       sort.bubbleSort(size10000);
       endTime = System.currentTimeMillis();
       System.out.println("The time in milliseconds to sort 10000 items using bubble sort is " + (endTime-startTime));

       startTime = System.currentTimeMillis();
       sort.selectionSort(size10000);
       endTime = System.currentTimeMillis();
       System.out.println("The time in milliseconds to sort 10000 items using selection sort is " + (endTime-startTime));

   }
}
