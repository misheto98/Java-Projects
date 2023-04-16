public class MyQueue {
    int front;
    int rear;
    int[] queue;
    int size;

    public MyQueue(int capacity){
        front = 0;
        rear = -1;
        size = 0;
        queue = new int[capacity];
    }

    public boolean qIsEmpty(){
        boolean r = false;
        if(size == 0){
            r = true;
        }
        return r;
    }

    public boolean qAdd(int element){
        boolean r = false;
        if(rear != queue.length -1){
            rear++;
            queue[rear] = element;
            size++;
            r = true;
        }
        return false;
    }

    public int qPool(){
        int r = 0;
        if(size != 0){
            front++;
            r = queue[front];
            size--;
        }
        return r;
    }

    public int qPeek(){
        int r = 0;
        if(!qIsEmpty()){
            r = queue[front];
        }
        return r;
    }
    public int qSize(){
        return size;
    }
    public void qPrint(){
        if(qIsEmpty()){
            System.out.println("Queue is empty");
        }else {
            System.out.print("[");
            for (int i = front; i <= rear; i++) {
                if(i != rear){
                    System.out.print(queue[i] + ",");
                }else {
                    System.out.print(queue[i]);
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
