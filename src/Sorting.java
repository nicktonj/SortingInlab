/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicktonjum
 */
public class Sorting 
{
    
   public void bubbleSort(int intArray[])

    {

        int n = intArray.length;
        int temp = 0;

        for(int i=0; i < n; i++){
               for(int j=1; j < (n-i); j++)
               {
                      if(intArray[j-1] > intArray[j])
                      {
                             temp = intArray[j-1];
                             intArray[j-1] = intArray[j];
                             intArray[j] = temp;
                      }

              }
       }

    }
   public void selectionSort(int[] arr)
    {
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[index]) 
                {
                    index = j;
                }
            }
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

}