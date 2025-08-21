import java.util.*;

public class Selection_sort {
    public static void selectionsort(int arr[]) {
        //outer loop where i = truns(assume)
        for(int i=0; i<arr.length-1; i++) {
            //inner loop
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {       //for decreasing order  ( arr[minPos] < arr[j] )
                    minPos = j;
                }
            }

            //swaap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
        
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to a new line after printing the array
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionsort(arr);
        printArr(arr); 
    }
}
