package com.cydeo.LinkedList;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }
    void add(int data){
        Node node = new Node(data);

        if (isEmpty()){
            head = tail = node;
            size++;
        }else{
            tail.next = node;
            tail = node;
            size++;
        }
    }
    void printNodes(){
        Node current = head;
        while(current!=null){
            if (current.next == null){
                System.out.print(current.id + " => null");
            }else{
                System.out.print(current.id + " => ");
            }
            current = current.next;
        }
    }
    void deleteById(int id){
        if (isEmpty()) System.out.println("List is Empty");

        Node current = head;
        Node previous = head;
        while(current!= null){
            if (id == current.id){
                if (current==head){
                    head = current.next;
                    current.next = null;
                }else if (current == tail) {
                    tail = previous;
                    previous.next=null;

                }else{
                    previous.next=current.next;
                    current.next=null;
                }
                size--;
            }
            previous=current;
            current=current.next;

        }
    }
    int indexOf(int id){
        if (isEmpty()) return -1;
        int pos = 0;
        Node current = head;
        while(current!=null){
            if (current.id == id){
                return pos;
            }
            pos++;
            current=current.next;
        }
        return -1;
    }
    void addFirst(int id){
        //Todo implementation
    }
}
