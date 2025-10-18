//lec-2.8 & 9 : Merge sort on LL

import java.util.*;

//import Detecting_Cycle_Code.Node;

public class Merge_Sort_on_LL {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //  Custom LinkedList class
    public static class LinkedList {
        Node head;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        private Node getMid(Node head) {
            Node slow = head;
            Node fast = head.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        private Node merge(Node head1, Node head2) {
            Node mergedLL = new Node(-1);
            Node temp = mergedLL;

            while (head1 != null && head2 != null) {
                if (head1.data <= head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                }
                temp = temp.next;
            }

            if (head1 != null) temp.next = head1;
            else temp.next = head2;

            return mergedLL.next;
        }

        public Node mergeSort(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node mid = getMid(head);
            Node rightHead = mid.next;
            mid.next = null;

            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);

            return merge(newLeft, newRight);
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println("Original List:");
        ll.print();

        ll.head = ll.mergeSort(ll.head);

        System.out.println("Sorted List:");
        ll.print();
    }
}

//time complexity is O(nlogn)