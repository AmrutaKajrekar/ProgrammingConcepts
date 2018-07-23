package problems.linkedlist;

/**
 * @author amruta.kajrekar on 7/4/18.
 */
public class OddEvenList {

    public static void main(String[] args){
        OddEvenList oddeven = new OddEvenList();
        oddeven.oddEvenList(ListNode.getSampleLinkedList());
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode evenHeadList = head.next;
        ListNode oddtail = head;
        ListNode eventail = head.next;

        while(eventail!=null && eventail.next!=null){
            oddtail.next = eventail.next;
            oddtail = oddtail.next;
            eventail.next = oddtail.next;
            eventail = eventail.next;
        }
        oddtail.next = evenHeadList;
        return head;
    }
}
