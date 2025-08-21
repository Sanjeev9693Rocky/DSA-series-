//chapter-13 :  ARRAY: an array is data structure that stores multiple values/ list of element of the same data types in a contiguous memmory location;
// lec-13.1 & 13.2 : Array & creating an array
// dataType arrayName[] = new dataType[size];
// do not change the size of array on run time execution

/* 
import java.util.*;

public class Creating_Array {

    public static void main(String args[]) {
        int marks[] = new int[50];    //size of array is 50

        int numbers[] = {1, 2, 3};    //size of array is 3

        string fruits[] = { "apple", "orange", "banana"};  //size of array is 3
    } 
}

*/
// pass by value : if changes in function then their is not reflect/ changes in main/calling function 
//pass by reference : it reflect and changes occurs in main?calling function
/* 

//lec-13.3 Array as a function argument

import java.util.*;



public class Creating_Array {

    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);

        //print our marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ") ;
            
        }
        System.out.println();
    }
}

*/

//nonChangeable

import java.util.*;



public class Creating_Array {

    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 10; 
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        int nonChangeable = 5;
        update(marks, nonChangeable );
        System.out.println(nonChangeable);

        //print our marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ") ;
            
        }
        System.out.println();
    }
}

