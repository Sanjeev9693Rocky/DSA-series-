import java.util.*; 


//lec-23.1 : ArrayList : In Java, an ArrayList is a resizable array (also called a dynamic array) that is part of the java.util package. Unlike a normal array in Java, whose size is fixed once created, an ArrayList can grow or shrink dynamically as elements are added or removed.


/* 

public class Introduction {

    public static void main(String args[]) {

        ArrayList<Integer>  list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //1. Add Operation    :   (time complexity : O(1))
        list.add(1);      
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);


        //2nd Method to Add operation   (time complexity : O(n))
        list.add(1, 9);
        System.out.println(list);



        //2. Get Operation    :   (time complexity : O(1))
        int element = list.get(2);     
        System.out.println(element);


        //3. Delete/Remove  Operation   (Time complexity : O(n))
        list.remove(2);
        System.out.println(list);



        //4. Set Element at Index   (Time Complexity : O(n))

        list.set(2, 10);
        System.out.println(list);

        //5. Contain elements : its value return in True or false    (time complexity : O(n))
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //6.    .size() [size of ArrayList]

        System.out.println(list.size());


        //print the arraylist 
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println;
    }
    
}

*/




/* 

//lec-23.4 : Qs.  Print Reverse of an ArrayList    ,  list= 1,2,3,4,5



public class Introduction {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);


        //Reverse print  [tc: O(n)]
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

*/




/* 

//lec-23.5 : Find Maximum in an ArrayList  ,        list = 2,5,9,3,6

public class Introduction {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);


        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }

        System.out.println("max element = " + max);


        
    }
}


*/


//lec-23.6 :  Swap 2 Numbers,  list = 2,5,9,3,6

public class Introduction {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }



    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);



        int idx1 = 1, idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println(list);




        
    }
}

