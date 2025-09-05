//package 21BackTracking;





/* 

//lec-21.3 Backtracking on array

public class Introduction {
    public static void changeArr(int arr[], int i, int val) {
        //base case
        if(i == arr.length) {
            printArr(arr);
            return;
        }

        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] -2;
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}


//Time complexity : O(n)
//Space Complexity : O(n)

*/


/* 

//lec-21.4 & 5
//Qs. Find Subsets: find & print all subsets of a given strings   "abc"

public class Introduction {

    public static void findSubsets(String str, String ans, int i) {

        //base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;

            
        }

        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);      //yes
        //No choice
        findSubsets(str, ans, i+1);                     //no

    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}

//Time complexity : O(n * 2^n )
//Space complexity : O(n) 

*/


//lec-21.6 & 7 : Find Permutations

public class Introduction {

    public static void findPermutations(String str, String ans) {
        //base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;

        }
        


        //recursion
        for(int i = 0; i<str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde" ==> "ab" + "de" = "abde"
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPermutations(Newstr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }

    
} 