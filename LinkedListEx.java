//LinkedList basics
public class LinkedListEx{


    public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

    public static void printList(Node n){
        while(n != null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] arggs){
        Node head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        head.next=second;
        second.next=third;
        printList(head);
    }
}