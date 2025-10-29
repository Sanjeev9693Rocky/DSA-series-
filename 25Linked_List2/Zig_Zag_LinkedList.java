//lec-25.10 & 11 Zig0Zag Linked List:
//for  a linked list of the the form : L(1)->L(2)->L(3)->L(4).....L(n-1)->L(n)
//convert into a zig-zig form i.e z; L(1)->L(n)->L(2)->L(n-1)->L(3)->L(n-2)....


//import java.util.*;



public class Zig_Zag_LinkedList {


    
    // Define Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head pointer
    public static Node head;
    public static Node tail;


    // addLast method (to add nodes at the end)
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print method
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void zigZag() {

        //find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        Node mid = slow;


        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;           //nextL- next left and nextR- next right



        //alt merge - zig-zag merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
            

            
        }
        
    }

    public static void main(String[] args) {
        Zig_Zag_LinkedList ll = new Zig_Zag_LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        System.out.println("before zig-zag");

        ll.print();

        System.out.println("after zig-zag");

        ll.print();
        
    }
    
}

    

