//lec-26.1 & 2 : Stack : It is linear data structure, which follow the LIFO rule (last in first out)
// Three Operations : 1.Push()  2.Pop(),  Peek(),   4.Empty




/* 

//creating stack with ArrayList

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

*/




/* 


//lec-26.3 : creating stack with LinkedList


import java.util.*;

public class CreatingStack {

    //creating Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
            
    }

   //creating stack class
    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }


        //push
        public static void push(int data) {
            Node newNode = new Node(data);

            if(isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }
        
        //pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
                
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
                
            }
            return head.data;

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

*/


//lec-26.4 : same question 26.3 is done through Java Collection Framework
 import java.util.*;

 public class CreatingStack {
 
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
 }