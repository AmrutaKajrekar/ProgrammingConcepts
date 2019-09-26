package problems.linkedlist;

import java.util.Stack;

/**
 * @author amruta.kajrekar on 7/22/18.
 */
public class ReorderList {

  public static void main(String[] args){
    ReorderList list = new ReorderList();
//    list.reorderList(ListNode.getSampleSortedLinkedList());
    list.reorderList(ListNode.getSampleSortedLinkedList(1,4));
  }
  public void reorderList(ListNode head) {
    Stack<ListNode> s = new Stack<ListNode>();
    ListNode curr = head;
    while(curr!=null){
      s.push(curr);
      curr=curr.next;
    }
    curr = null;
    int i=0;
    int n=s.size();
    ListNode pre = head;
    while(i<=s.size()){ // cant use n<=stack.size()/2 because stack.size() is changing, so we get the original size initially
      curr = s.pop();
//      System.out.println("cur = " + (curr!=null ? curr.val : null));
//      System.out.println("pre = " + (pre!=null ? pre.val : null));
//      System.out.println("curr.next = " + (curr.next!=null ? curr.next.val : null ));
//      System.out.println("pre.next = " + (pre.next!=null ? pre.next.val : null));
      curr.next = pre.next;
      pre.next = curr;
      pre = curr.next;
      i++;
    }

    if(s.size()% 2 == 0){
      curr.next = null;
    }else{
      pre.next = null;
    }
    curr = head;
    printList(curr);

  }

  private void printList(ListNode curr) {
    while(curr!=null){
      System.out.print(curr.val+":");
      curr=curr.next;
    }
  }

}
