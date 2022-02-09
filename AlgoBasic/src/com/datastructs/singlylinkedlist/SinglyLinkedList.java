package com.datastructs.singlylinkedlist;

public class SinglyLinkedList<T> {
    private LinkedListNode<T> head;


    public void setHead(LinkedListNode<T> head) {
        this.head = head;
    }

    public LinkedListNode<T> getHead() {
        return head;
    }

    public void display(){
        LinkedListNode current = head;
        System.out.println('\n'+"List is ************* ");
        while(current != null){
            System.out.print(current.getData().toString()+"-->");
            current = current.getNext();
        }

    }

    public int length(){
        LinkedListNode current = head;
        int len=0;
        while(current != null){
            len++;
            current = current.getNext();
        }
        return len;
    }

    public void insertHead(LinkedListNode head){
        LinkedListNode current = this.head;
        this.head = head;
        head.setNext(current);

    }

    public void deleteHead(){
        this.head = head.getNext();
    }

    public void insertEnd(LinkedListNode end){
        LinkedListNode current = this.head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(end);

    }

    public void deleteEnd(){
        LinkedListNode current = this.head;
        LinkedListNode previous = null;
        while(current.getNext() != null){
            previous = current;
            current = current.getNext();
        }
        if(previous != null){
            previous.setNext(null);
        }


    }

    public void insertAt(LinkedListNode end, int index){
        LinkedListNode current = this.head;
        LinkedListNode previous = null;
        int count = 0;
        while(current != null){
            if(count == index){
                end.setNext(current);
                if(previous != null) {
                    previous.setNext(end);
                }
                break;
            }
            previous = current;
            current = current.getNext();
            count ++;
        }


    }

    public void deleteAt( int index){
        LinkedListNode current = this.head;
        LinkedListNode previous = null;
        int count = 0;
        while(current != null){
            if(count == index){

                if(previous != null) {
                    previous.setNext(current.getNext());
                }
                break;
            }
            previous = current;
            current = current.getNext();
            count ++;
        }


    }

    public Integer search(T data){
        LinkedListNode current = this.head;
        Integer index =0;

        while(current != null){
            if(current.getData().equals(data)){

                System.out.println("found" + current.getData());
                return index;
            }
            current = current.getNext();
            index++;

        }
    return null;
    }

    public SinglyLinkedList reverse(){
        SinglyLinkedList reverseList = new SinglyLinkedList();

        LinkedListNode current = this.getHead();
        LinkedListNode temp = null;


        while(current != null){
            temp =  new LinkedListNode(current.getData());
            if(this.getHead() != current){

                temp.setNext(reverseList.getHead());
            }
            reverseList.setHead(temp);
            current = current.getNext();
        }
        return reverseList;
    }

    public LinkedListNode getMiddleNode() {
        if(head == null) {
            return null;
        }
        LinkedListNode slowPtr = head;
        LinkedListNode fastPtr = head;

        while(fastPtr != null && fastPtr.getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
        }
        System.out.println("Middle pointer  >>> "+ slowPtr.getData());
        return slowPtr;
    }

    public LinkedListNode getNthNodeFromEnd() {
        if(head == null) {
            return null;
        }
        LinkedListNode slowPtr = head;
        LinkedListNode fastPtr = head;

        while(fastPtr != null && fastPtr.getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
        }
        System.out.println("Middle pointer  >>> "+ slowPtr.getData());
        return slowPtr;
    }

}
