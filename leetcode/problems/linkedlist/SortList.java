package problems.linkedlist;

/**
 * @author amruta.kajrekar on 7/22/18.
 */
public class SortList {
  public static void main(String[] args){
    SortList list = new SortList();
    list.sortList(ListNode.getSampleUnsortedLinkedList());
  }

  public ListNode sortList(ListNode head) {
    ListNode newhead = new ListNode(0);
    newhead.next = head;
    ListNode curr = head;

    if(head==null) return head;
    while(curr.next!=null) {
      if (curr.val > curr.next.val) {
        //swap
        ListNode temp = curr;
        ListNode next = curr.next.next;
        head = head.next;
        head.next = temp;
        temp.next = next;
      }
      curr=curr.next;
    }
    return head;
  }

}
