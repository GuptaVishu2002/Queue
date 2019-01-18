    class ex4_0 {
        public static void main(String[] args) {
			MyQueue q = new MyQueue(5);

		    q.enqueue("a");         System.out.println("aを入れた");
		    q.enqueue("b");         System.out.println("bを入れた");
		    q.enqueue("c");         System.out.println("cを入れた");
		    System.out.println(q);
		    System.out.println(q.dequeue() + "を取り出した");
		    System.out.println(q.dequeue() + "を取り出した");
		    System.out.println(q.dequeue() + "を取り出した");
		    System.out.println(q);
		    if(q.isEmpty()==true)
		    	System.out.println("Queue is empty");
		    else
		    	System.out.println("Queue is not empty");	
		    MyQueue Q = new MyQueue(5);
		    Q.enqueue("d");         System.out.println("dを入れた");
		    Q.enqueue("e");         System.out.println("eを入れた");
		    Q.enqueue("f");         System.out.println("fを入れた");
		    Q.enqueue("g");         System.out.println("gを入れた");	
		    Q.enqueue("h");         System.out.println("hを入れた");	
		    if(Q.isEmpty()==true)
		    	System.out.println("Queue is empty");
		    else
		    	System.out.println("Queue is not empty");	
      	    Q.enqueue("i");         System.out.println("iを入れた");			        		    
        }
    }
