import java.util.*;


//lec-17.1,2,3,4: Bit manipulation means performing operations directly on the bits (0 and 1) of numbers

/* 

package BitManipulation;

public class BitBasic {
    public static void main(String[] args) {


        System.out.println((5 & 6));   //Binary And &
        System.out.println((5 | 6));   //Binary OR |
        System.out.println((5 ^ 6));   //Binary one's complement ~
        System.out.println(( ~5 ));
        System.out.println((~0));
        System.out.println((~1));
        System.out.println((5 << 2));  //Binary left shift <<
        System.out.println((6 >> 1)); 

    }
}

*/


 

class BitBasic {
public static void odd_Or_Even(int n) {
    int bitMask = 1;
    if((n & bitMask) == 0) {
        //even number
        System.out.println("even number");
    } else {
        System.out.println("odd number");
    }
}
    
public static void main(String[] args) {
    odd_Or_Even(3);
    odd_Or_Even(11);
    odd_Or_Even(14);
}


}