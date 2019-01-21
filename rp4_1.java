class rp4_1 {
    public static void main(String[] args){
        MyQueue3 q = new MyQueue3();
        q.enqueue("a",1);         System.out.println("enqueue a");
        q.enqueue("b",2);         System.out.println("enqueue b");
        q.enqueue("c",2);         System.out.println("enqueue c");
        System.out.println(q);
        System.out.println("dequeue: " + q.dequeue());
        System.out.println("dequeue: " + q.dequeue());
        System.out.println("dequeue: " + q.dequeue());
        System.out.println(q);
        q.enqueue("d",1);         System.out.println("enqueue d");
        q.enqueue("e",3);         System.out.println("enqueue e");
        System.out.println("dequeue: " + q.dequeue());
        System.out.println(q);
        q.enqueue("f",2);         System.out.println("enqueue f");
        System.out.println("dequeue: " + q.dequeue());
        System.out.println("dequeue: " + q.dequeue());
        System.out.println(q);
        q.clear();              System.out.println("clear q");
        System.out.println(q);
        q.enqueue("g",1);         System.out.println("enqueue g");
        q.enqueue("h",3);         System.out.println("enqueue h");
        System.out.println(q);
    }
}
