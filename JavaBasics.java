/*
//lec- 6.1 & 6.2
//Boilerplate  code ( it code in every java codes)

public class JavaBasics {         // it is called public class
    public static void main( String args[]) {   // its called "main function"



    }
}

 */

/* 

//lec-6.3 - output in java
 public class JavaBasics {
    public static void main( String args[]) {
        System.out.print("Hello world! \n");
        System.out.print("Hello sanjeev! \r");
        System.out.print("1 2 3 4 \r\n");
        System.out.println("how are you ");


    }
}

*/

/* 

//lec-6.4 -> pattern
public class JavaBasics {
    public static void main(String args[]) {
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}

*/


/* 
//lec-6.5  variables in java
public class JavaBasics {
    public static void main( String args[]) {
        int a = 10;
        int b = 5;
        System.out.println("a");    //only print a 
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        String name= "tony bhai";
        System.out.println(name);
        

        a=50;  //if change the value of a
        System.out.println(a);

        a = b;
        System.out.println(a);


    }
}

*/

/* 

//lec-6.6 Data types
//primitive datatypes:-byte, short, int, char, float, boolean, double, long
//non-primitive dataypes:-string, array, class, object,interface

public class JavaBasics {
    public static void main( String args[]) {
        byte b = 8;
        System.out.println(b);
        char ch = 'a';  //only single character has been print
        System.out.println(ch);
        boolean var = true;    //it only print 'ture' or 'false'
        System.out.println(var);
        int number = 99;
        System.out.println(number);
        double price = 56.99;
        System.out.println(price);
        //long
        //double
        short n = 240;
        System.out.println(n);
        

        



    }
}

*/

/* 

// lec-6.7  sum of a & b
public class JavaBasics{
    public static void main(String args[]) {
        int a= 5;
        int b= 10;
        int sum = a+b;
        System.out.println(sum);
    }
}

*/


// lec-6.8  comments in java
// single line comments
/*
 for 
 mtltiple line
 comments
 */

/* 

 // lec- 6.9 Input in java

 import java.util.*;   //it is the package in java

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);          //sc-> scanner object
    //    String input = sc.next();         // for single word input print
    //    System.out.println(input);

    //String name = sc.nextLine();      // for line or paragraph input print
    //System.out.println(name);

    int number = sc.nextInt();          // for printing integer input value
    System.out.println(number);
    }
    
 }

 */ 

 /* 

// lect- 6.10  sum of a & b from input user 

 import java.util.*;   //it is the package in java

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
 } 
    
*/

/* 

//lec- 6.11  product of a & b from input user
import java.util.*;   //it is the package in java

 public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println(product);
    }
 } 

*/
/* 

//lec-6.12 Area of circle
import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println(area);
    }
}
*/

/*

//lec- 6.13  Type conversion

import java.util.*;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    }
}
*/

/* 
//lect-6.14   Type casting
import java.util.*;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a= 25.999f;
        int b = (int)a;
        System.out.println(b);
    }
}
*/

//lec-6.15  Type promotion in expressions
//1. jave automatically promotes each byte, short, or char operand to int when evaluating an expression
//eg-1
/* 
import java.util.*;
public class JavaBasics {

    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);
        System.out.println(a);
    }
}
*/
/* 
//eg-2
import java.util.*;
public class JavaBasics {

    public static void main(String[] args) {
        short a =  5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a+b+c);
        System.out.println(bt);
    }
}
*/    

//2.If one operand is long, float or double the whole expression is promoted to long, float, or double respectively.
/* 
import java.util.*;
public class JavaBasics {

    public static void main(String[] args) {
        int a= 10;
        float b= 20.25f;
        long c = 25;
        double d = 30;
        double ans = a+b+c+d;
        System.out.println(ans);
    }
}
*/

//eg-2
public class JavaBasics {
    public static void main(String[] args) {
        byte b  = 5;
        byte a = (byte) (b * 2);
        System.out.println(a);
    }
}

//lec-6.16 - this is theory lec which is written in copy
