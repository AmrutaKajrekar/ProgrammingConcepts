package linkedlist;


/**
 * @author amruta.kajrekar on 5/16/18.
 */
public class KthToLastNode {

    public static void main(String[] args){
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        KthToLastNode kth = new KthToLastNode();
        System.out.println(kth.nthToLastNode(node1,2));
    }

    public int nthToLastNode(ListNode node, int k){
        if(node==null) return 0;

        int n = nthToLastNode(node.next, k) + 1;
        if (n == k) {
            System.out.println("found = " + node.val);
        }
        return n;
    }

}
