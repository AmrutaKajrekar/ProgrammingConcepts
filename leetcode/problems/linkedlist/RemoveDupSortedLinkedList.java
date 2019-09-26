package problems.linkedlist;

/**
 * @author amruta.kajrekar on 6/27/18.
 */
public class RemoveDupSortedLinkedList {

    public static void main(String[] args){
        RemoveDupSortedLinkedList dup = new RemoveDupSortedLinkedList();
        ListNode node6 = new ListNode(8);
        ListNode node5 = new ListNode(6, node6);
        ListNode node4 = new ListNode(5, node5);
        ListNode node3 = new ListNode(2);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1,node2);
        ListNode result = dup.deleteDuplicates(node1);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode l1 = head;
        while(l1.next!=null && l1.next.next!=null){
            if(l1.val==l1.next.val){
                l1.next.val = l1.next.next.val;
                l1.next = l1.next.next;
            }
            l1=l1.next;
        }

        if(l1!=null && l1.next!=null && l1.next.next==null && l1.val==l1.next.val){
            l1.next=null;
        }
        return head;
    }
}
