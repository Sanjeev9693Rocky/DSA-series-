//lec-26.1 & 2 : Stack : It is linear data structure, which follow the LIFO rule (last in first out)
// Three Operations : 1.Push()  2.Pop(),  Peek(),   4.Empty


import java.util.*;

public class CreatingStack {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size() == 0;
        }



        //push
        public static void push(int data) {
            list.add(data);
        }


        //pop
        public static int pop(){
            if(isEmpty()) {    // if stack is empty then it shows -1
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;

        }


        //peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }

            return list.get(list.size() -1);
        }
    }  
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);


        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
        
    
    
}
