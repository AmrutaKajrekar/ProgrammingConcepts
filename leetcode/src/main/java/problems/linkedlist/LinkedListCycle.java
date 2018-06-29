package problems.linkedlist;

/**
 * @author amruta.kajrekar on 6/27/18.
 */
public class LinkedListCycle {

    public static void main(String[] args){
        ListNode node6 = new ListNode(8);
        ListNode node5 = new ListNode(6, node6);
        ListNode node4 = new ListNode(5, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1,node2);
//        node6.next = node1;

        LinkedListCycle cy = new LinkedListCycle();
        System.out.println(cy.hasCycle(node1));
    }

    public boolean hasCycle(ListNode head) {
        while(head!=null){
            System.out.print("="+head.val);
            if(head.val==Integer.MIN_VALUE) return true;
            else{
                head.val = Integer.MIN_VALUE;
                head = head.next;
            }
        }
        return false;
    }


}
