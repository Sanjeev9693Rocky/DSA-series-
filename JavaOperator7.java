
/* 
//lec-7.1  Operator- it is an symbol or keyword that tell compiler to perform some operation

public class JavaOperator7 {
    public static void main(String[] args) {
        int a= 9;
        int b=10;
        int sum= a + b;
        System.out.println(sum);  //19     
    }
}
*/

/* 

//lec-7.2   Arithmatic operators(Binary: +,-,*,/,%   &  Unary: ++, --)

public class JavaOperator7 {

    public static void main(String[] args) {
        int A =10;
        int B= 5;
        System.out.println(A + B);
        System.out.println(A * B);
        System.out.println(A - B);
        System.out.println(A / B);
        System.out.println(A % B);
        
    }
}
*/

/* 

//lec-7.3 & 7.4  Unary operator :- it required single operand

import java.util.*;

public class JavaOperator7 {

    public static void main(String[] args) {
        // for ++a(pre increment) and a++(post increment)
        int a= 10;
        //int b = ++a;           // a=11 & b=11
        int b = a++;             //a=11 & b=10
        System.out.println(a);
        System.out.println(b);



        //for --a(pre decrement)  and a--(post decrement)
        int c = 10;
        //int d = --c;              //c=9 & d=9
        int d = c--;                // c=9 & d=10
        System.out.println(c);
        System.out.println(d);
        
    }
}
*/

//lec-7.5  Relational operator
/* 
//1. == (Equal to )
public class JavaOperator7 {

    public static void main(String[] args) {
        int A = 10;
        int B = 10;         //true
        //int B = 5;       //false
        System.out.println((A==B));
    }
}
*/

/* 

//2. != (not equal to)
public class JavaOperator7 {

    public static void main(String[] args) {
        int A = 10;
        //int B = 10;                 // false
        int B = 5;                    // true

        System.out.println((A !=B));
    }
}
*/

/* 

//3. > (greater)
public class JavaOperator7 {

    public static void main(String[] args) {
        int A = 10;
        //int B = 5;                 // true
        int B = 15 ;                  //false

        System.out.println(A > B);
    }
}
*/

/* 

//4. < (less than)
public class JavaOperator7 {

    public static void main(String[] args) {
        int A = 10;
        //int B = 5;             // true
        int B = 15;              // false
        System.out.println((B < A));
    }
}
*/    

/* 

//5. >= (greater than equal to )   and  <= (less than equal to)
public class JavaOperator7 {

    public static void main(String[] args) {
        int A= 10;
        int B = 10;
       System.out.println((A <= B));   // true
       System.out.println((A >= B));   // true
       
    }
}
*/    


//lec-7.6   Logical operators
/*

//1. && (logical AND)

import java.util.*;
public class JavaOperator7 {

    public static void main(String[] args) {
        System.out.println( (3>2) && (5>1) );
        System.out.println( (5<2) && (5>1) );
        System.out.println( (3<2) && (5<1) );

    }
}
*/


/* 
//2. ||  (loogical OR)

import java.util.*;
public class JavaOperator7 {

    public static void main(String[] args) {
        System.out.println( (3>2) || (5>1) );
        System.out.println( (3>2) || (5<1) );
        System.out.println( (3<2) || (5>1) );
        System.out.println( (3<1) || (5<1) );

    }
}
*/

/* 
//3. ! (logical NOT)  : its also called "not operator" 
import  java.util.*;

public class JavaOperator7 {

    public static void main(String[] args) {
        System.out.println( !(3<5) );     //false
        System.out.println( !( 3>5 ));    // true
    }
}
*/




//lec-7.7  Assignment  Operators (are: =, +=, -=, *=, /=, %= )
import java.util.*;

public class JavaOperator7 {

    public static void main(String[] args) {
        int A = 10;
        // A = A + 10;           //20
        A += 10;                 //20 more fast execute
        System.out.println(A); 
        
        int B = 20;
        //int B = B - 10;     //10
        B -= 10;              //10
        System.out.println(B);  



        int C = 5;
        // int C = C * 5;                //25
        C *= 5;                          //25
        System.out.println(C);


        int D = 20;
        // int D = D/5;                   // 4
        D /= 5;                           //4
        System.out.println(D);



        int E = 10;
        //int E = E%5;           // 0
        E %= 5;                  //0
        System.out.println(E);
    }
}