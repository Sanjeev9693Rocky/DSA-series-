//lec-5   Find the largest number in the given list

/* 

import java.util.*;

public class Largest_Number {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;    //-infinity

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];                  //update the largest
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("largest value is : " + getLargest( numbers));
    }
}


*/


import java.util.*;

public class Largest_Number {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;    //+infinity

        for(int i=0; i<numbers.length; i++) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("smallest value is : " + getSmallest( numbers));
    }
}