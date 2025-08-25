//lec-17.17 Qs. check a number power of 2 or not


/* 
public class Questions {
    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1)) == 0;
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
        System.out.println(isPowerOfTwo(8));
    }
}

*/

//lec-17.18  Qs. Count Set Bits in a Number

public class Questions {

    public static int countSetBit(int n ) {
        int count = 0;
        while ((n > 0)) {
            if((n & 1) != 0) {  //check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
         
    }

    public static void main(String[] args) {
        System.out.println(countSetBit(16));
    }
}