package dev.rodrigovaz.list;

public class Node<T> {
    private T content;
    private Node next;
    private Node tail;
    private Node head;

    public Node() {
        this.next = null;
        this.tail = null;
        this.head = null;
        this.content = null;
    }

    public Node(T content) {
        this.content = content;
        this.next = null;
        this.tail = null;
        this.head = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }
}