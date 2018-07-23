package problems.linkedlist;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    public ListNode(int x, ListNode n) { val = x; next=n;}

    /**
     * This method will return a sample list as 1-2-3-4-5-6-7-NULL.
     * @return ListNode object that points to the head of the list
     */
    public static ListNode getSampleLinkedList(){
        ListNode node11 = new ListNode(11);
        ListNode node10 = new ListNode(10, node11);
        ListNode node9 = new ListNode(9, node10);
        ListNode node8 = new ListNode(8, node9);
        ListNode node7 = new ListNode(7, node8);
        ListNode node6 = new ListNode(6, node7 );
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode head = new ListNode(0, node1);

        return node1;
    }

    public static ListNode getSampleUnsortedLinkedList(){
        ListNode node8 = new ListNode(4);
        ListNode node7 = new ListNode(7, node8);
        ListNode node6 = new ListNode(0, node7 );
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(8, node5);
        ListNode node3 = new ListNode(-3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(11, node2);
        return node1;
    }
}
