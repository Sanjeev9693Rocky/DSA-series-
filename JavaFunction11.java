//chapter- Fnction & Method:- function is typicaaly refered to as method.
//   Method is a block of code that perform a specific task and it is definedd within class.
// "function is block of code which use mutliple of time at same code (reuseable)"
//lec-11.1 & 11.2
/* 
public class JavaFunction11 {
    public static void printHelloWorld()  {              //new function which its our own creatable function
        System.out.println("HEllo World");
        System.out.println("HEllo World");
        System.out.println("HEllo World");



    }
                                        
    public static void main(String[] args) {
        printHelloWorld();     //function call
        
    }
}
*/


//lec-11.3 & 11.4 syntax with parameter
//  method- 1.
/* 
import java.util.*;

public class JavaFunction11 {
    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is : " + sum);
    }

    public static void main(String[] args) {
        calculateSum();
    }

    
}
*/


/* 
//method-2.
import java.util.*;

public class JavaFunction11 {
    public static void calculateSum(int a, int b) {   //        // here int a & int b is parameters or formal parameters     
        int sum = a + b;
        System.out.println("sum is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();
        calculateSum(a, b);    // pass the value a & b : it called arguments or actual parametrs
    }

    
}
*/


//lec-11.6 call by value: it is method of passing the arguments to a function where a copy of the actual value passed to the function
//it directly swap
/* 
public class JavaFunction11 {
    public static void swap(int a, int b) {
        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }

    public static void main(String[] args) {
        //swap- exchange the the values
        int a = 5;
        int b = 10;
        swap(a, b);
    }

}
*/

/* 
//example of call by value: it only pass its copy value not orignal
public class JavaFunction11 {
    public static void swap(int a, int b) {
        //swap
        int temp = a;
        a = b;
        b = temp;

        
    }

    public static void main(String[] args) {
        //swap- exchange the the values
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }

}
*/

/* 
//lec-11.7 product of two numbers
public class JavaFunction11 {
    public static int mutliply(int a, int b) {
        int product = a * b;
        return product;
        
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int prod = mutliply(a, b);
        System.out.println("a * b = " + prod);

        prod = mutliply(10, 20);
        System.out.println("a * b =" +prod);
    }
    
}    
*/

/* 

//lec-11.8: factorial of a number, n

public class JavaFunction11 {
public static int factorial(int n) {
    int f = 1;

    for(int i=1; i<=n; i++) {
        f = f * i;
    }

    return f; //factorial of n
}

public static void main(String arg[]) {
    System.out.println(factorial(4));
    System.out.println(factorial(5));
}

}
*/

/* 
// lec-11.9  Binomial coefficient
public class JavaFunction11 {
     // Factorial method
     public static int factorial(int n) {
            return 1;
        return n * factorial(n - 1);
    }

// Binomial Coefficient method
    public static int  binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;

    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
} 
*/

/* 
//lec-11.11,12  : function overloading using parameters
public class JavaFunction11{
  //function to calculate sum of 2 nums
    public static int sum(int a, int b){
        return a + b;
    }

    //func to calc sum of 3 nums
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5,6,7));
    }
}
*/


/* 
//lec-11.13 : function overloading using data types
public class JavaFunction11 {
    // func to calc int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    //func to cal float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));
    }
}
*/

//lec-11.14 check if a number is prime or not
/* 
//method-1
public class JavaFunction11 {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++) {
            if(n % i ==0) {   //completing dividing
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {
        System.out.println(isPrime(11));
        System.out.println(isPrime(12));
    }
}
*/

/* 
//method-2
public class JavaFunction11 {
    //only for n>=2
    public static boolean isPrime(int n){
        //corner cases
        //2
        if(n == 2) {
            return true;
        }

        for(int i=2; i<=n-1; i++) {
            if(n % i ==0) {   //completing dividing
                return  false;
            
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(12));
    }
}
*/
/* 
//lec-11.15   check prime (optimised)
public class JavaFunction11 {

    public static boolean isPrime(int n){
       if(n == 2) {
        return true;
       }

       for(int i=2; i<=Math.sqrt(n); i++) {
        if(n % i == 0){
            return false;
        }
       }
       return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));
        
    }
}
*/
/* 
//lec-11.16 : print all primes in a range
public class JavaFunction11 {

    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {   //true
                System.out.print(i+" ");
            }

        }
        System.out.println();    //nextline
    }
    public static void main(String[] args) {
        primesInRange(20);  // prime b/w  2 to 20
    }
}
*/

/* 
//lec-11.17 & 18: binary to decimal 
public class JavaFunction11 {

    public static void binToDec(int binNum){
        int myNum = binNum;   //asign the number for saving
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.println("decimal of " + myNum +" = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(111);
        binToDec(1000);
        binToDec(101);
    }
}
*/



//lec-11.19 & 20 : decimal to binary
public class JavaFunction11 {

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while ((n > 0)) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
            
        }
        System.out.println("binary form of " + myNum + " = "+ binNum);
    }
     public static void main(String[] args) {
        decToBin(7);
        decToBin(34);
        decToBin(8);
     }
}