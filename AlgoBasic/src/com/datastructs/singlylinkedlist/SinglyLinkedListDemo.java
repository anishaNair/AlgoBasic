package com.datastructs.singlylinkedlist;

public class SinglyLinkedListDemo {
    public static void main(String [] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll.setHead(new LinkedListNode("head"));
        LinkedListNode second = new LinkedListNode<>("second");
        LinkedListNode third = new LinkedListNode<>("third");
        LinkedListNode forth = new LinkedListNode<>("forth");
        sll.getHead().setNext(second);
        second.setNext(third);
        third.setNext(forth);

        sll.display();
        System.out.println(sll.length());
        sll.insertHead(new LinkedListNode("first"));
        sll.display();
        sll.insertEnd(new LinkedListNode("fifth"));
        sll.display();
        sll.insertAt(new LinkedListNode("Random"),2);
        sll.display();
        sll.deleteHead();
        sll.display();
        sll.deleteEnd();
        sll.display();
        sll.deleteAt(3);
        sll.display();
        System.out.println("index  === " + sll1.search("forth"));
        sll.display();
        sll.reverse().display();
        sll.insertHead(new LinkedListNode<>("added"));
        sll.insertHead(new LinkedListNode<>("added2"));
        sll.insertHead(new LinkedListNode<>("added3"));
        sll.display();
        sll.getMiddleNode();

    }
}
