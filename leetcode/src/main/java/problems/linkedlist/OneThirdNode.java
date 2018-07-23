package problems.linkedlist;

/**
 * @author amruta.kajrekar on 7/9/18.
 */
public class OneThirdNode {
    public static void main(String[] args){
        OneThirdNode node = new OneThirdNode();
        node.printOneThirdNodes(ListNode.getSampleLinkedList());
    }

    public void printOneThirdNodes(ListNode head){
        ListNode one = head;
        ListNode two = head.next;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            one = one.next;
            two = two.next.next;
            fast = fast.next.next.next;
        }

        System.out.println("1/3 found = " + one.val);
        System.out.println("2/3 found = " + two.val);

    }
}
