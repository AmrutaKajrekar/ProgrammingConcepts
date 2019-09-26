package problems.linkedlist;

/**
 * @author amruta.kajrekar on 6/26/18.
 */
public class MergeLinkedList {

    public static void main(String[] args){
        MergeLinkedList list = new MergeLinkedList();
        ListNode node6 = new ListNode(8);
        ListNode node5 = new ListNode(6, node6);
        ListNode node4 = new ListNode(5, node5);

        ListNode node3 = new ListNode(9);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1,node2);

        ListNode result = list.mergeTwoLists(node1, node4);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        if(l1.val>=l2.val) {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }

}
