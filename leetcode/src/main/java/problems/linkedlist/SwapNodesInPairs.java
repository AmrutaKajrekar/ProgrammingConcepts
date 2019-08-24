package problems.linkedlist;

/**
 * @author 212431401 on 8/23/19.
 */
public class SwapNodesInPairs {

  public static void main (String[] args){
    SwapNodesInPairs obj = new SwapNodesInPairs();

    ListNode node5 = new ListNode(5);
    ListNode node4 = new ListNode(4,node5);
    ListNode node3 = new ListNode(3,node4);
    ListNode node2 = new ListNode(2,node3);
    ListNode node1 = new ListNode(1,node2);

    //System.out.println("--------------Pre:");
    //ListNode.printLinkedList(node1);
    node1 = swap(node1);
    System.out.println("--------------Post:");
    ListNode.printLinkedList(node1);
  }

  public static ListNode swap(ListNode head){
    if(head==null || head.next==null) return head;
    ListNode curr = head.next;
    ListNode prev = null;

    while(head!=null && head.next!=null) {
      ListNode temp = head.next;
      head.next = head.next.next;
      temp.next = head;

      if(prev!=null){
        prev.next = temp;
      }

      prev = head;
      head = head.next;
    }

    return curr;
  }

}
