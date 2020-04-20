package linkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LinkedListBasicOperation {
    private class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) throws Exception{
        LinkedListBasicOperation ls=new LinkedListBasicOperation();
        ls.insertAtLast(10);
        ls.insertAtLast(20);
        ls.insertAtLast(30);
        ls.insertAtLast(40);
        ls.display();
        ls.reverse();
        ls.display();

    }

    public void display(){
        Node temp=this.head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void insertAtLast(int value){
        Node nn=new Node();
        nn.data=value;
        nn.next=null;
        if (this.size>=1){
            this.tail.next=nn;
        }
        if (size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }else {
            this.tail=nn;
            size++;
        }
    }
    private Node getNodeAt(int index) throws Exception {
        if (this.size==0){
            throw new Exception("Empty List");
        }
        Node temp=this.head;
        for (int i=0;i<=index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void reverse() throws Exception {
        int left=0;
        int right=this.size-1;
        while (left<right){
            Node ln=getNodeAt(left);
            Node rn=getNodeAt(right);
            int x=ln.data;
            ln.data=rn.data;
            rn.data=x;
            left++;
            right--;

        }

    }

}
