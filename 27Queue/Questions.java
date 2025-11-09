//lec-27.4 : Queue using Linked list
//time complexity = O(n)


/* 

public class Questions {
    

    //Node class
    static class  Node {
    
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }

    static class Queue {
    
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        //add
        public static void add(int data) {
            Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
            
        }
        tail.next = newNode;
        tail = newNode;
        }

        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            //single element
            if(tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        //peek 
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
        
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}


*/


/* 


//lec-27.5 : Java collection Framework

//the same above question is done through with "Java Collection Framework"

import java.util.*;
import java.util.LinkedList;


public class Questions {
      

    public static void main(String[] args) {
       // Queue q = new Queue();
       //Queue<Integer> q = new LinkedList<>();
       Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

*/


/* 

//lec-27.6 : Queue using 2 Stacks  : its done with push O(n)

import java.util.*; 

public class Questions {

    static class Queue {
    
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        //add  - O(n)
        public static void add(int data) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }

            return s1.pop();
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }

            return s1.peek();
        }
        
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

*/



//lec-27.7 : Stack using 2 Queues : it done with pop O(n) 
import java.util.*;

public class Questions {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }

            int top = -1;

            // Case 1: q1 has data
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break; // last element → top
                    }
                    q2.add(top);
                }
            } 
            // Case 2: q2 has data
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
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
