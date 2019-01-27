public class MyNode2 {
    String name;
    int rank;
    MyNode2 next;
    MyNode2 prev;
    MyNode2(String name, int rank){
    	this.rank = rank;
        this.name = name;
        next = null;
        prev = null;
    }
    MyNode2(String name){
        this.name = name;
        next = null;
        prev = null;
    }
    
    
    public String toString(){
        return this.next.name + " (" + this.next.rank + ") " + " <== [" + this.name + "] (" + this.rank +  ") ==> " + this.prev.name + " (" + this.prev.rank + ") ";
    }
}
