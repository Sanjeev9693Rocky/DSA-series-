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


/* 


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

*/



//lec-24.8 & 9 : Remove of a linked list 1.remove First    2.remove last

/* 

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


    //remove in a linked list

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val  = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //remove last
    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev : i = size-2
        Node prev = head;
        for(int i = 0; i<size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;      //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
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

        ll.addLast(5);

        //ll.add(2, 9);

        ll.print();
        System.out.println(ll.size);  //printing size of linked list

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println(ll.size);

        
        
        
    }
    
}


*/


/* 


//lec-24.10 : Search (Iterative)


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


    //search the key 

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
    }


    


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();    //ll -> object
       

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addLast(5);
        ll.addLast(3);

        ll.print();

        System.out.println(ll.itrSearch(4));
        System.out.println(ll.itrSearch(10));
        
        
        
    }
    
}


*/







 


//lec-24.11 : Search (Recursive)
// Search for a key in a Linked List. Return the position where it is found. If not found, return -1. Use Recursion.
//Time and Space complexity : O(n) , Linear


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


     


    //Search(Recursive) : Time and Space complexity  : O(n)

    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }


    public int recursiveSearch(int key) {
        return helper(head, key);
    }


    


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();    //ll -> object
       
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        

        ll.print();

        System.out.println(ll.recursiveSearch(3));
        System.out.println(ll.recursiveSearch(10));
        
        
        
    }
    
}