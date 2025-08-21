//lec-16.1 & 16.2 :  what is string  &  input - ouput

/* 

import java.util.*;

public class Strings {
    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        String str = "abcd";
        String str2 = new String("xyz");

        //string are immutable

        Scanner sc = new Scanner(System.in);
        String name;
        //name = sc.next();  //next() print only single character or word
        name = sc.nextLine(); //nextLine() print the line
        System.out.println(name);
    }
}


*/


/* 

//lec-3 String length

import java.util.*;

public class Strings {

    public static void main(String[] args) {
        String fullName = "sanjeev ranjan";
        System.out.println(fullName.length());
        
        

    }
}


*/


/* 

//lec-16.4  concatanation  : combination of two or more string or character

import java.util.*;

public class Strings {

    public static void main(String[] args) {
        String firstName = "sanjeev";
        String lastName = "ranjan";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println(firstName.charAt(3));
    }
}


*/



//lec-16.5 print all letter of string

import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "sanjeev";
        String lastName = "ranjan";
        String fullName = firstName + " " + lastName;

        printLetters(fullName);
    }
}