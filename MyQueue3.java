class MyQueue3 {

    private MyNode2 front = null;
    private MyNode2 rear  = null;
    private int size = 0;
    private MyNode2 sentinelNode;
    static final String SENTINEL = "*SENTINEL*";
    private int common=100 ;

    MyQueue3(){
        sentinelNode = new MyNode2(SENTINEL,common);
        clear();
    }

    public void clear(){
        front = sentinelNode;
        rear  = sentinelNode;

        front.next = rear;
        rear.prev = front;

        size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(String name){
        MyNode2 newData = new MyNode2(name);
        MyNode2 myData = front.prev;
        newData.prev = myData;
        newData.next = myData.next;
        myData.next.prev = newData;
        myData.next = newData;

        size++;
        return;
    }
    
    public void enqueue(String name, int rank){
        MyNode2 newData = new MyNode2(name,rank);
        MyNode2 myData = front.prev;
        newData.prev = myData;
        newData.next = myData.next;
        myData.next.prev = newData;
        myData.next = newData;     

        while(newData.rank > newData.prev.rank){
        	MyNode2 data1 = newData.prev;
		    MyNode2 data2 = data1.prev;
		    MyNode2 data3 = newData.next;
		    if(data2 != null) {
			    data2.next = newData;
		    }
		    newData.prev = data2;
		    newData.next = data1;
		    data1.prev = newData;
		    data1.next = data3;
		    if(data3 != null) {
		   	    data3.prev = data1;
		    }
        }
        size++;
        return;
    }

    public MyNode2 dequeue(){
        if (isEmpty()){
            return null;
        }else{
            MyNode2 value = front.next;
            value.prev.next = value.next;
            value.next.prev = value.prev;
            size--;
            if (size==0){
                rear = front;
            }
            return value;

        }
    }

    public String toString(){
        MyNode2 pos = front.next;
        String s = "MyQueue3=[\n";
        while(pos != front){
            s += "    " + pos + "\n";
            pos = pos.next;
        }
        s += "]\n  front ( " + front + " ) rear";
        return s;
    }
}
