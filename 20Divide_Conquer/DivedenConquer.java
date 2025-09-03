//package 20Divide&Conquer;




/* 

//Merge Sort

public class DivedenConquer {

    public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

 
    public static void mergeSort(int arr[], int si, int ei) {  //si -> starting index , ei-> ending index
        //base case 
        if(si >= ei) {
            return;
        }

        //Kaam
        int mid = si + (ei - si)/2;  //(si+ei)/2
        mergeSort(arr, si, mid);      //left part
        mergeSort(arr, mid+1, ei);    //right part
        merge(arr, si, mid, ei);

    }
     //merge
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;              //iterator for left part
        int j = mid + 1;         // iterator for right part
        int k = 0;               //iterator for temp arr


        while(i <= mid && j <= ei) {
        if(arr[i] < arr[j]) {
            temp[k] = arr[i];
            i++;
        } else {
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    //left part
    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    //right part
    while (j <= ei) {
        temp[k++] = arr[j++];
    }

    //copy temp to original arr
    for(k=0, i=si; k<temp.length; k++, i++) {
        arr[i] = temp[k];
    }

    }

    
    
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}


*/


/* 


//Quick sort

public class DivedenConquer {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // partition
        int pivotIdx = partition(arr, si, ei);

        // recursive calls
        quickSort(arr, si, pivotIdx - 1);  // left side
        quickSort(arr, pivotIdx + 1, ei);  // right side
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];   // last element as pivot
        int i = si - 1;        // index of smaller element

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i], arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;  // pivot index
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}


*/



//Search in Rotated Sorted Array

//input: sorted, rotated array with distinct numbers(in ascending order) . It is rotated at a pivot point. Find the index of given element.    
// [4, 5, 7, 0, 1, 2] target: 0  and output: 4

public class DivedenConquer {
    public static int search(int arr[], int tar, int si, int ei) {
        //base case
        if(si > ei) {
            return -1;
        }


        //kaam
        int mid = si + (ei-si)/2;  


        //case Found
        if(arr[mid] == tar) {
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]) {
            //case a : left
            if(arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid-1);
            } else {
                //case b : right
                return search(arr, tar, mid+1, ei);
            }

        }

        //mid on L2
        else{
            //case c : right
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei ); 
            
            } else {
                //case d : left
                return search(arr, tar, si, mid-1);
            }

        }



    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; //output -> 4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}