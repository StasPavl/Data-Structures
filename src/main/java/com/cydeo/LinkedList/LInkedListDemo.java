package com.cydeo.LinkedList;

public class LInkedListDemo {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(node1);
        System.out.println(node1.next.id);

        System.out.println("node1s address is : " + node1 + " next address is " + node1.next);
        System.out.println("node2s address is : " + node2 + " next address is " + node2.next);
        System.out.println("node3s address is : " + node3 + " next address is " + node3.next);
        System.out.println("node4s address is : " + node4 + " next address is " + node4.next);



        //ITERATION----------------------------

        Node current;
        Node head = node1;
        current = head;
        while (current != null){
            System.out.println("Id of node is " + current.id);
            current = current.next;
        }
    }
}
