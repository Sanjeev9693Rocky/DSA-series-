// All Question are Important , all the company question

//lec-24.12 : Reverse a Linked List : Iterative Approach

// Time and Space complexity : linear , O(n)



/* 

public class Reverse_LinkedList {

    

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


     





    //Reverse the Linked List : Iterative approach

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        head = prev;

    }

    


    public static void main(String[] args) {
        Reverse_LinkedList ll = new Reverse_LinkedList();    //ll -> object
       
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        

        ll.print();

        ll.reverse();

        ll.print();
        
        
        
    }
    
}

*/
    



//lec-24.13 : Find & Remove Nth node from End (Iterative Approach)


public class Reverse_LinkedList {

    

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


     





    //Reverse the Linked List : Iterative approach

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        head = prev;

    }


    //  Reverse a Linked List : Iterative Approach

    public void deleteNthfromEnd(int n) {
        //calculate size
        int sz = 0;  // sz = size
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
            
        }

        if(n == sz) {
            head = head.next;   //removeFirst
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
            
        }

        prev.next = prev.next.next;
        return;
         

    }

    


    public static void main(String[] args) {
        Reverse_LinkedList ll = new Reverse_LinkedList();    //ll -> object
       
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        

        ll.print();

        ll.deleteNthfromEnd(3);
        ll.print();
        
        
        
    }
    
}
    




