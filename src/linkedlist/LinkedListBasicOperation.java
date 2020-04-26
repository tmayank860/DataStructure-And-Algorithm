package linkedlist;

public class LinkedListBasicOperation {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;


    public static void main(String[] args) throws Exception {
        LinkedListBasicOperation ls = new LinkedListBasicOperation();
        ls.insertAtFirst(10);
        ls.insertAtLast(20);
        ls.insertAtFirst(30);
        ls.insertAtFirst(40);
        ls.display();
        System.out.println(ls.getNodeAt(0).data);
        System.out.println("Fisrt value ---->" + ls.getFirst());
        System.out.println("Last Value ---->" + ls.getLast());
        System.out.println("Value at index----->" + ls.getAt(2));
        System.out.println("Remove First ---->" + ls.removeFirst());
        System.out.println("Remove First ---->" + ls.removeFirst());
        System.out.println("Remove First ---->" + ls.removeFirst());
//        System.out.println("Remove First ---->"+ls.removeFirst());
//        System.out.println("Remove First ---->"+ls.removeFirst());
        ls.insertAtLast(300);
        ls.insertAtLast(400);
        ls.insertAtLast(500);
        ls.insertAtLast(600);
        ls.display();
        System.out.println(ls.removeAt(1));
        ls.display();
        ls.reverse();
        ls.display();
        ls.reversePointer();
        ls.display();

    }
// First Element of LL
    public int getFirst() throws Exception {
        if (size == 0) {
            throw new Exception("Empty List");
        }
        return this.head.data;
    }
//  Last Element of LL
    public int getLast() throws Exception {
        if (size == 0) {
            throw new Exception("LL is Empty");
        }
        return this.tail.data;
    }

    //    O(n)
    public void display() {
        Node temp = this.head;
        System.out.println("-----------------------------");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("-----------------------------");
    }
//O(n)
    public void insertAtLast(int value) {
        Node nn = new Node();
        nn.data = value;
        nn.next = null;
        if (this.size >= 1) {
            this.tail.next = nn;
        }
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            size++;
        }
    }
//O(1)

    public void insertAtFirst(int value) {
        Node nn = new Node();
        nn.data = value;
        nn.next = null;
        if (size >= 1) {
            nn.next = head;
        }
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else {
            this.head = nn;
            size++;
        }
    }

    private Node getNodeAt(int index) throws Exception {
        if (this.size == 0) {
            throw new Exception("LinkedList is empty");
        }
        if (index < 0 || index >= size) {
            throw new Exception("Invalid index");
        }
        Node temp = this.head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getAt(int index) throws Exception {
        if (this.size == 0) {
            throw new Exception("LinkedList is empty");
        }
        if (index < 0 || index >= size) {
            throw new Exception("Invalid index");
        }
        Node temp = this.head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    //O(1)
    public int removeFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("LL is empty");
        }
        int firstValue = this.head.data;

        if (size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            this.head = this.head.next;
            size--;
        }
        return firstValue;
    }

    //O(n)
    public int removeLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("LL is empty");
        }
        int lastValue = this.tail.data;

        if (size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            Node secondLast = getNodeAt(this.size - 2);
            this.tail = secondLast;
            this.tail.next = null;
            size--;
        }
        return lastValue;
    }

    //    O(n)
    public int removeAt(int index) throws Exception {
        if (size == 0) {
            throw new Exception("LL is empty");
        }
        if (index < 0 || index >= size) {
            throw new Exception("Invalid index");
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == this.size - 1) {
            return removeLast();
        } else {
            Node currentNode = getNodeAt(index);
            Node previousNode = getNodeAt(index - 1);
            Node nextNode = getNodeAt(index + 1);
            int val = currentNode.data;
            previousNode.next = nextNode;
            this.size--;
            return val;
        }

    }

public void reverse() throws Exception {
        int left=0;
        int right=this.size-1;
        while (left<right){
            Node leftNode=getNodeAt(left);
            Node rightNode=getNodeAt(right);
            int temp=leftNode.data;
            leftNode.data=rightNode.data;
            rightNode.data=temp;
            left++;
            right--;
        }
}

public void reversePointer(){
        Node previos=this.head;
        Node current=previos.next;
        while (current!=null){
            Node ahead=current.next;
            current.next=previos;

            previos=current;
            current=ahead;
        }
      Node t=this.head;
        this.head=this.tail;
        this.tail=t;

        this.tail.next=null;

}

}
