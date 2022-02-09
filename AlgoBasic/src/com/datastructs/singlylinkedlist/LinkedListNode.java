package com.datastructs.singlylinkedlist;

public class LinkedListNode<T> {
    private T data;
    private LinkedListNode<T> next;

    public T getData() {
        return data;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNode(T data){
        this.data = data;
        this.next = null;
    }
}
