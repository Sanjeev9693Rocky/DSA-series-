//lec-13.7 :  Reverse an array

import java.util.*;

public class Reverse_Array {
    public static void rverse_an_array(int numbers[]) {
        int first = 0, last= numbers.length-1;

        while (first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
            
        }
    }


    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        rverse_an_array(numbers);     //first call the value than print

        // print the array
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] +" ");
        }

        System.out.println();
    
    }
}
