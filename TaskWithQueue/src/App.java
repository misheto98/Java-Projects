public class App {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.qAdd(11);
        q.qAdd(5);
        q.qAdd(3);
        q.qAdd(9);
        q.qAdd(6);
        q.qPrint();

        System.out.println(q.qPeek());
        q.qPrint();
        //delete
        q.qPool();
        q.qPool();

        q.qPrint();
    }
}
