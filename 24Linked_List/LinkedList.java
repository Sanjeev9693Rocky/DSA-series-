//package 24Linked_List;

//What is linked List : It is linear data structure where is data/element(called node) are stored in non-contiguous memory location.
// Each node contains :   1. data    2. Pointer
//1. data -> The actual value is stored
//2. Pointer(next reference) -> a reference to next node in the list 



/* 


//lec-24.1 : how to create LinkedList/Node

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        
    }
    
}

*/


/* 

//lec-24.2

//creating Head and tail of node

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();    //ll -> object
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        
    }
    
}

*/



//lec-24.3 & 4 : Add in Linked List
//add First or add Last of the node

//lec-24.5 print Linked List

//lec-24.6 : Add in the middle ,   add(index, data) 

//lec-24.7 : Size of a Linked List



public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //adding the node
    public void addFirst(int data) {
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        //if node is null
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head;   //link


        //step3 - head = newNode
        head = newNode;
    }


    //add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    //Print Linked List  -> TC : O(n)
    public void print() {
        //base code
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
            
        }
        System.out.println("null");
    }


    //add in the middle    ,   [ add(index, data) ]
    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
            
        }

        //i = idx-1;  temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();    //ll -> object
        //ll.print();
        ll.addFirst(2);
        //ll.print();
        ll.addFirst(1);
        //ll.print();

        ll.addLast(3);
        //ll.print();
        ll.addLast(4);

        ll.add(2, 9);

        ll.print();
        System.out.println(ll.size);  //printing size of linked list
        
    }
    
}