package interviews;

/**
 * @author amruta.kajrekar on 6/17/18.
 */
public class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next=null;
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
