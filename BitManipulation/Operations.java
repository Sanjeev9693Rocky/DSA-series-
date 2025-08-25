//lec-17.11: 
//1.Get ith bit


/* 
public class Operations {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(10, 3));
    }
}

*/

/*

//lec-17.12
//2. set ith bit

public class Operations {
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
        System.out.println(setIthBit(10, 3));
    }
}

*/

/* 
//lec-17. 13
//3.clear ith bit

public class Operations {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
        System.out.println(clearIthBit(10, 3));
    }
}

*/


//lec-17.14 Update ith bit

public class Operations {
    // clear ith bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // set ith bit
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // update ith bit
    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }


    //clear last bit //lec-17.15
    public static int clearIthBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    //clear in range //17.16
    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) <<(j+1));
        int b  = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }


    
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1)); // clear ith bit
        System.out.println(updateIthBit(10, 3, 1)); // set ith bit
        System.out.println(clearIthBits(15, 2)); //12
        System.out.println(clearBitsInRange(10, 2, 4));  //2
    }
}
