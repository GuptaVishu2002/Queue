public class MyNode {
    String name;
    MyNode next;
    MyNode prev;
    MyNode(String name){
        this.name = name;
        next = null;
        prev = null;
    }
    
    public String toString(){
        return this.next.name + " <== [" + this.name + "] ==> " + this.prev.name;
    }
}
