package queue;

public class QueueUsingArrays {
    public static void main(String[] args) throws Exception {
        QueueUsingArrays q=new QueueUsingArrays();
        q.enqueue(12);
        q.enqueue(23);
        q.enqueue(43);
        System.out.println(q.dequeue());
        q.enqueue(18);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.display();
    }
    private int[] data;
    private int size;
    private int front;
    public static final int DEFAUL_CAPACITY = 10;

    public QueueUsingArrays() throws Exception {
        this(DEFAUL_CAPACITY);
    }

    public QueueUsingArrays(int capacity)throws Exception{
        if(capacity<1){
            throw new Exception("Invalid Capacity");
        }
        this.data=new int[capacity];
        this.size=0;
        this.front=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public void enqueue(int value) throws Exception{
        if (this.size()==this.data.length){
            throw new Exception("Queue is full");
        }
        int ai=(this.front+this.size)%this.data.length;
        this.data[ai]=value;
        this.size++;
    }
    public int dequeue()throws Exception{
        if (this.size()==0){
            throw new Exception("Queue is empty");
        }
        int  rv=this.data[this.front];
        this.data[this.front]=0;
        this.front=(this.front+1)%this.data.length;
        this.size--;
        return rv;
    }
    public int front()throws Exception{
        if (this.size()==0){
            throw new Exception("Queue is empty");
        }
        int  rv=this.data[this.front];
        return rv;
    }
    public void display(){
        for (int i=0;i<this.size;i++){
            int ai=(this.front+i)%this.data.length;
            System.out.print(this.data[ai]+"=>");
        }
    }


}
