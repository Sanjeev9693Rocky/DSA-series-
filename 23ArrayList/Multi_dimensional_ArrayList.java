
//lec-23.8 & 9 : Multi-dimensional ArrayList 
// a multi-dimensional ArrayList means an ArrayList of ArrayLists (like a dynamic 2D array).
//Since ArrayList is a class, not a primitive array, you can create a nested structure where each element of an ArrayList is itself another ArrayList.


import java.util.*;


/* 


public class Multi_dimensional_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);


        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }

        System.out.println(mainList);

    }
    
}


*/


//Qs. Create a multi-dimensional ArrayList, list is given below :
// list1 : 1 2 3 4 5
// list2 : 2 4 6 8 10
// list3 : 3 6 9 12 15


public class Multi_dimensional_ArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();


        for(int i=1; i<=5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);



        //  nested loops
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
    }
}