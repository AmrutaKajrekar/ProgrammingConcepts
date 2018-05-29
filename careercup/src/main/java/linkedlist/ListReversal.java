package linkedlist;

/**
 * @author amruta.kajrekar on 5/16/18.
 */
public class ListReversal {
    public static void main(String[] args){
        ListReversal rev = new ListReversal();
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

        ListNode node = rev.reverseList(node1);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    private ListNode reverseList(ListNode node1) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = node1;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node1 = prev;
        return node1;
    }

}
