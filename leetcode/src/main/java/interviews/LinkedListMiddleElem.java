package interviews;

/**
 * @author amruta.kajrekar on 6/17/18.
 */
public class LinkedListMiddleElem {

    public static void main(String[] args){
        LinkedListMiddleElem middle = new LinkedListMiddleElem();
        Node node7 = new Node(4);
        Node node6 = new Node(3,node7);
        Node node5 = new Node(6,node6);
        Node node4 = new Node(8,node5);
        Node node3 = new Node(9,node4);
        Node node2 = new Node(2,node3);
        Node node1 = new Node(5,node2);
        System.out.println(middle.findMiddle(node1));
    }

    public int findMiddle(Node node){
        Node slow = node;
        Node fast = node;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}
