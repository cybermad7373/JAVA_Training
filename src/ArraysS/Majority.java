package ArraysS;

import java.util.Arrays;

// MAJORITY will be morea than 50% of the given data
public class Majority {

    public static  void Maj(int array[])
    {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
               int count = 0;
               for (int j = 0; j < array.length; j++) {
                 if (array[i]==array[j])
                 {
                     count++;
                 }            
           }
          if (count >= max)
              max = count;
         }
         System.out.println(max);
    }
    public static void main(String[] args) {
        int[] array = new int[] {2,2,1,1,1,1,2};
        Maj(array);
        /////////////////////
        Arrays.sort(array);
        
    }
    
}
