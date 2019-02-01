class MyQueue4 {

    private MyNode3 front = null;
    private MyNode3 rear  = null;
    private int size = 0;
    private MyNode3 sentinelNode;
    static final String SENTINEL = "*SENTINEL*";
    private int common=100 ;
    private int thing = 1;

    MyQueue4(){
        sentinelNode = new MyNode3(SENTINEL,common,thing);
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
   
   	public int queueSize(){
   		return size;
   	}

    public void enqueue(String name){
        MyNode3 newData = new MyNode3(name);
        MyNode3 myData = front.prev;
        newData.prev = myData;
        newData.next = myData.next;
        myData.next.prev = newData;
        myData.next = newData;

        size++;
        return;
    }
    
    public void enqueue(String name, int rank){
        MyNode3 newData = new MyNode3(name,rank);
        MyNode3 myData = front.prev;
        newData.prev = myData;
        newData.next = myData.next;
        myData.next.prev = newData;
        myData.next = newData;     

        while(newData.rank > newData.prev.rank){
        	MyNode3 data1 = newData.prev;
		    MyNode3 data2 = data1.prev;
		    MyNode3 data3 = newData.next;
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
    
    public void enqueue(String name, int rank, int type){
        MyNode3 newData = new MyNode3(name,rank,type);
        MyNode3 myData = front.prev;
        newData.prev = myData;
        newData.next = myData.next;
        myData.next.prev = newData;
        myData.next = newData;     

        while(newData.rank > newData.prev.rank){
        	MyNode3 data1 = newData.prev;
		    MyNode3 data2 = data1.prev;
		    MyNode3 data3 = newData.next;
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

    public MyNode3 dequeue(){
        if (isEmpty()){
            return null;
        }else{
            MyNode3 value = front.next;
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
        MyNode3 pos = front.next;
        String s = "[\n front";
        while(pos != front){
            s += pos;
            pos = pos.next;
        }
        return s +"rear \n ]";
    }
}
