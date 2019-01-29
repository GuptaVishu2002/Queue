public class MyNode3 {
    String name;
    int rank;
    int type;
    MyNode3 next;
    MyNode3 prev;
    
    MyNode3(String name, int rank, int type){
    	this.type = type;
    	this.rank = rank;
        this.name = name;
        next = null;
        prev = null;
    }
    MyNode3(String name, int rank){
    	this.rank = rank;
        this.name = name;
        next = null;
        prev = null;
    }
    MyNode3(String name){
        this.name = name;
        next = null;
        prev = null;
    }
    
    public String getName(){
    	return this.name;
    }
    
    
    public String toString(){
        return "=[" + this.name + "　] (" + this.rank +","+this.type + ")=";
    }
}
