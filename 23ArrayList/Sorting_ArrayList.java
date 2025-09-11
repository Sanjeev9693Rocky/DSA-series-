import java.util.*;




//lec-23.7 : Sorting in ArrayList

//Collections.sort()

public class Sorting_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);


        //ascending order
        Collections.sort(list);
        System.out.println(list);

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
    
}
