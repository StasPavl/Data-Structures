package com.cydeo.LinkedList;

public class SinglyLisnkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        myList.deleteById(7);
        myList.deleteById(9);
        myList.deleteById(0);
        myList.printNodes();
        System.out.println();
        System.out.println(myList.indexOf(9));
    }
}
