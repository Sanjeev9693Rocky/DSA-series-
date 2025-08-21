// chapter -8 Conditional  Statement : it perform based on certain condition

//lec-8.1 if-else statement 
/* 
public class JavaConditional_St8 {
    public static void main(String[] args) {
        int age = 22;
        if(age >= 18) {
            System.out.println("adult: drive, vote ");
            
        }
        else {
            System.out.println("not adult");
        }
    }
    
}


*/

/* 

public class JavaConditional_St8 {
    public static void main(String[] args) {
        int age = 16;
        if(age >= 18) {
            System.out.println("adult: drive, vote ");
            
        }
        
        if(age >10 && age< 13) {
            System.out.println("teenager");
        }

        if( age >13 && age <18 ) {
            System.out.println("above teenager");
        }
        else {
            System.out.println("not adult");
        }
    }
    
}

*/

/* 
//lec-8.2  Print the largest of 2 number
public class JavaConditional_St8 {

    public static void main(String[] args) {
        int A = 1;
        int B = 5;

        if(A >= B) {
            System.out.println("A is the largest of 2 number");

        } else {
            System.out.println("B is the largest of 2 number");
        }
    }
}
*/

/* 
// lec-8.3  Print if a number is odd or even
import java.util.*;

public class JavaConditional_St8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
*/

/* 

//lec-8.4  else-if statement
import java.util.*;

public class JavaConditional_St8 {

    public static void main(String[] args) {
        int age = 13;

        if( age >=18){
            System.out.println("adult");
        }
        else if(age >= 13 && age < 18) {
            System.out.println("teeneger");
        }
        else{
            System.out.println("child");
        }
    }
}
*/

/* 

//lec-8.5   Income Tax calculator
import java.util.*;

public class JavaConditional_St8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;            // automatically create '0' tax

        if(income < 500000) {
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000) {
            tax = (int) (income  * 0.2);
        }
        else{
            tax = (int) (income * 0.3);
        }

        System.out.println("your tax is :" + tax);
    }
}
*/

/* 

//lec-8.6    print the largest 3 number
public class JavaConditional_St8 {

    public static void main(String[] args) {
        int A = 1, B= 3, C = 6;

        if( (A >= B) && (A>=C)) {
            System.out.println("largest is A");
        }
        else if(B >= C) {
            System.out.println("largest is B");
        }
        else{
            System.out.println("largest is C");
        }
    }
}
*/

/* 

//lec-8.7   Ternary operator

public class JavaConditional_St8 {

    public static void main(String[] args) {
        int number = 4;

        //ternary operator
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
*/

/* 

//lec-8.8  check if a student will 'pass' or ' fail' with ternary operator
public class JavaConditional_St8 {

    public static void main(String[] args) {
        int marks = 35;

        String reportCard = marks >= 33 ? "pass" : "fail";
        System.out.println(reportCard);
    }
}
*/

/* 

//lec-8.9  Switch  statement
public class JavaConditional_St8 {

    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 1 : System.out.println("samosa");
                     break;
            
            case 2 : System.out.println("burger");
                    break;
                    
            case 3 : System.out.println("mango shake");
                    break;
                    
            default : System.out.println("we wake up from dream");        
        }
    }
}
*/



//lec-8.10   calculator using switch statement
import java.util.*;

public class JavaConditional_St8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a :");
        int a = sc.nextInt();

        System.out.println("enter operator: ");
        char operator = sc.next().charAt(0);

        System.out.println("enter b : ");
        int b = sc.nextInt();


        switch(operator) {
            case '+' : System.out.println(a+b);
                       break;

            case '-' : System.out.println(a-b);
                       break;

            case '*' : System.out.println(a*b);
                       break;
                       
            case '/' : System.out.println(a/b);
                       break;
                       
            case '%' : System.out.println(a%b);
                       break;
                       
            default   : System.out.println("wrong operator");           

        }

        
    }
}