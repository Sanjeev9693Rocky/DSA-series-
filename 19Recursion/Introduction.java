//package 19Recursion;

//lec-19 : Recursion: it is when a function calls itself to solve 'a smaller part of same problem'. 

/* 

//lec-19.1 Qs: Print numbers from n to 1 (Decreasing Order)

public class Introduction {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}

*/

/* 

//lec-19.2,3,4 : Print numbers from n to 1 (Increasing Order)

public class Introduction {
    public static void printInc(int n) {
        if(n == 1) {
            System.out.println(n+" ");
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }

    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}

*/

/* 

//lec-19.5 : Qs, print factorial of n number
public class Introduction {

    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);    //fcat: factorial of n  minus 1
        int fn = n * fact(n-1);
        return fn;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        
    }
}

*/

/* 

//lec-19.6 : Qs, Print the sum of n natural number
public class Introduction {

    public static int calculateSum(int n) {
    if(n == 1) {
        return 1; 

    }

    int Snm1 = calculateSum(n-1);    //Snm : sum of n minus 1
    int Sn = n + Snm1;
    return Sn;

    } 
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calculateSum(n));
    }


     
}

*/


/* 

//lec-19.7 :Qs, Print the fibanacii of n number

public class Introduction{
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fib(n-1);  //fnm1 fibnacci of n minus 1
        int fnm2 = fib(n-2);  //fnm1 fibnacci of n minus 2
        int fn = fnm1 + fnm2;  //fn: fibnacii of n
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(21));
    }


    //space complexity : O(n)
    //Time complexity: O(2^n)
}

*/


/* 

//lec-19.8: Qs. Check if a given array is sorted or not.

public class Introduction {

    public static boolean issorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return issorted(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int arr1[] = {1, 2, 3, 5, 4};
        int arr2[] = {5, 6};
        System.out.println(issorted(arr, 0));
        System.out.println(issorted(arr1, 0));
        System.out.println(issorted(arr2, 0));
    }

    //time complexity : O(n)
    //space complexity: O(n)
}

*/



/* 

//lec-19.9, Qs. WAF to find the first occurance of an element in an array

public class Introduction {
    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }

        if(arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurence(arr, 5, 0));
        
    }

    //Time complexity: O(n)
    //Space complexity: O(n)
}

*/

/* 

//lec-19.10, Qs. WAF to find the last occurence of an element in an array

public class Introduction {

    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

       return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurence(arr, 5, 0));
        
    }
}

*/


/* 

//lec-19.11: Qs. print x^n

public class Introduction {

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        // int xnm1  = power(x, n-1);   
        // int xn = x * xnm1;
        // return xn;


        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}

*/



/* 
//lec-19.12 : Qs. Print x^n in O(logn) by optimized

public class Introduction {

    public static int optimizePower(int a, int n ) {
        if(n == 0) {
            return 1;
        }

        //int halfPowerSqr = optimizePower(a, n/2) * optimizePower(a, n/2);
        int halPower = optimizePower(a, n/2);
        int halfPowerSqr = halPower * halPower;

        //n is odd
        if(n % 2 != 0) {
            halfPowerSqr = a * halfPowerSqr;
        }

        return halfPowerSqr;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(optimizePower(a, n));
    }
}

*/


/* 

//lec-19.13,14: Qs. Tiling Problem

public class Introduction {

    public static int tilingProblem(int n) {    //2 X n (floor size)

        if(n == 0 || n == 1) {
            return 1;
        }

        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizantal choice
        int fnm2 = tilingProblem(n-2); 

        int totWays = fnm1 + fnm2;

        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
        System.out.println(tilingProblem(2));
        System.out.println(tilingProblem(4));
    }

*/


/* 

//lec-19.15 : Qs. Remove Duplicates in a String    "appnnacollege"

public class Introduction {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        //base case
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }


}

*/

/* 

//lec-19.16: Qs.Friends Pairing Problem

public class Introduction {

    public static int friendsPairing(int n) {

        //base 
        if(n == 1 || n == 2) {
            return n;
        }

        //choice
        //single
        int fnm1 = friendsPairing( n - 1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totWays
        int totWays = fnm1 + pairWays;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(4));
        System.out.println(friendsPairing(3));
    }
}

*/



//lec-19.17 : Binary Strings Problem Qs. Print all binary strings of size n without consecutive ones 

public class Introduction {

    public static void printBinStrings(int n, int lastPlace, StringBuilder str) {

        //base
        if(n == 0) {
            System.out.println(str);
            return;
        }


        //kaam
        /* 
        if(lastPlace == 0) {
            //sit 0 on chair n
            printBinStrings(n-1, 0,  str.append("0"));
            printBinStrings(n-1, 1,  str.append("1"));

        } else {
            printBinStrings(n-1, 0, str.append("0"));
        }
        */

        printBinStrings(n-1, 0, str.append("0"));
        if(lastPlace == 0) {
            printBinStrings(n-1, 1, str.append("1"));
        }
    }

    public static void main(String[] args) {

        printBinStrings(3, 0, new StringBuilder(""));
        
    }
}