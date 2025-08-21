// chaptrer-9 Loops :-> loops also knows as iterative statement , are used when we need to execute a block of code repetively
// 1. while loop
//2.  for loop
// 3. do while loop

/* 
//lec-9.1 loop

public class JavaLoops9 {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
}
*/

/* 
// lec-9.2  while loop : it tepeats/allows a block of code to be executed  as long as a given condition is true.
// in this first condition is checked then work have to executed/do

public class JavaLoops9 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 20) {
            System.out.println("hello world");
            counter++;
            
        }

        System.out.println("hello world printed 20x");
    }
}
*/

/* 
// lec-9.3  print number from 1 to 10
public class JavaLoops9 {

    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10 ) {
            System.err.println(counter);
            counter++;
            
        }
    }
}
*/

/* 
//lec- 9.4  print number from 1 to n (from user)

import java.util.*;

public class JavaLoops9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.println(counter + " ");
            counter++;
            
        }
        System.out.println();
    }
}
*/

/* 

//lec-9.5  print sum of first n natural numbers

import java.util.*;

public class JavaLoops9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
            
        }
        System.out.println("sum is :" + sum);
    }
}
*/

/* 

// lec-9.6 for loop : A For loop is used when the number of iterations is known.  [for(initialisation; condition; updation) { // do somethings}  ]
import java.util.*;

public class JavaLoops9 {

    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            System.out.println("hello bhai");
        }
    }
}
*/

/*

//lec-9.7  print Square pattern
public class JavaLoops9 {

    public static void main(String[] args) {
        for(int line=1; line<=4; line++) {
            System.out.println("****");
        }
    }
}
*/

/* 

//lec-9.8  print the reverse of a number
public class JavaLoops9 {

    public static void main(String[] args) {
        int n = 67995;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;
            
        }
        System.out.println();
    }
}
*/

/* 
//lec-9.9 do while loop : A Do-While loop runs at least once and then continues if a condition is true.
// in this first do the work then after check the condition  
// do { // do somethings} while(condition)

public class JavaLoops9 {

    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println("hello world");
            counter++;
        } while(counter <= 10);
    }
}
*/

/* 
//lec-9.10 Break statement: it used to exit the loop

public class JavaLoops9 {

    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            if( i== 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop");
    }
}
*/

/* 

//lec-9.11  keep entering numbers till user enters a multiple of 10
import java.util.*;

public class JavaLoops9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter your number :");
            int n = sc.nextInt();

            if( n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while(true);

    }
}
*/

/* 

//lec-9.12    continue statement : to skip an iteration
public class JavaLoops9 {

    public static void main(String[] args) {
        for( int i=1; i<=5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
*/

/* 

// lec-9.13  Display all numbers entered by user except multiples of 10

import java.util.Scanner;

public class JavaLoops9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter your number : ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                continue;
            }

            System.out.println("number was : " + n);
        } while(true);
    }
}
*/


//lec-9.14  check if a number is prime or not
import java.util.*;

public class JavaLoops9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            //for(int i=2; i<=n-i; i++) {
            for(int i=2; i<=Math.sqrt(n); i++){
                if( n % i == 0) {    // n is a multiple of i (i is not equal to 1 or n)
                    isPrime = false;
                }
            }

            if(isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }
    }
}




//For Loop, While Loop, and Do-While Loop are different loops in programming.
// A For loop is used when the number of iterations is known. 
//A While loop runs as long as a condition is true. 
//A Do-While loop runs at least once and then continues if a condition is true.