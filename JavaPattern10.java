// chapter pattern

/* 
//lec-10.1 print star pattern with nested loop

public class JavaPattern10 {
    public static void main(String[] args) {
        for(int line=1; line<=4; line++) {
            //one line
            for(int star=1; star<=line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
*/


/* 
//lec- 10.2 print character pattern
public class JavaPattern10 {

    public static void main(String[] args) {
        int n=4;
        char ch = 'A';

        //ourtloop
        for(int line=1; line<= n; line++) {
            
            //inner loop
            for(int chars=1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.err.println();
        }
    }
}
*/
/* 

//lec-10.3 print INVERTED-STAR pattern
public class JavaPattern10 {

    public static void main(String[] args) {
        int n=4;
        for(int line = 1; line<=n; line++ ) {
            for(int star=1; star<=n-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/


 /* 
//lec-10.4  print Half-pyramid pattern
public class JavaPattern10 {

    public static void main(String[] args) {
        //out er loop
        int n = 4;

        for(int line=1; line<=n; line++) {
            //numbers print
            for(int number=1; number<=line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}

*/

//10.5 : Print Character Pattern
public class JavaPattern10 {

    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';

        //outer loop
        for(int line = 1; line<=n; line++){
            //inner loop
            for(int chars= 1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.err.println();
        }
    }
}




