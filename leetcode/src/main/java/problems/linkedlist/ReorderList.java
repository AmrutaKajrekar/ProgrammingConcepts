package problems.linkedlist;

import java.util.Stack;

/**
 * @author amruta.kajrekar on 7/22/18.
 */
public class ReorderList {

  public static void main(String[] args){
    ReorderList list = new ReorderList();
    list.reorderList(ListNode.getSampleSortedLinkedList());
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
//    while(i<=(s.size()/2)+1){
//      ListNode temp = curr.next;
//      ListNode t2 = s.pop();
//      curr.next = t2;
//      t2.next = temp;
//      curr = curr.next.next;
//      i++;
//    }
    ListNode pre = head;
    while(i<=s.size()){ // cant use n<=stack.size()/2 because stack.size() is changing, so we get the original size initially
      curr = s.pop();
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
//    curr.next = null;
    curr = head;
    while(curr!=null){
      System.out.print(curr.val+":");
      curr=curr.next;
    }
    System.out.print(curr.val+":");
  }

}
