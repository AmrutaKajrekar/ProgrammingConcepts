package problems.linkedlist;

/**
 * @author amruta.kajrekar on 7/21/18.
 */
public class MyLinkedList {
  public static void main(String[] args){
    MyLinkedList linkedList = new MyLinkedList();
    linkedList.addAtHead(1);
    linkedList.addAtTail(3);
    linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
    linkedList.get(1);            // returns 2
    linkedList.deleteAtIndex(1);  // now the linked list is 1->3
    linkedList.get(1);            // returns 3
  }
  ListNode head =null;
  int index;
  int count =0;

  /** Initialize your data structure here. */
  public MyLinkedList() {
    head = null;
    index =0;
  }

  /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  public int get(int index) {
    ListNode curr = head;
//    System.out.println("curr.val = "+ curr.val);
    if(index>count) return -1;
    if(index==0) return head.val;
    for(int i=1;i<index;i++){
//      System.out.println("adding after = "+ i);
      curr = curr.next;
    }
    print();
    System.out.println("curr.val = "+ curr.val);
    return curr.val;
  }

  /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
  public void addAtHead(int val) {
    ListNode temp = new ListNode(val,null);
    temp.next = head;
//    System.out.println("temp addAtHead="+temp.val);
    head=temp;
//    System.out.println("head addAtHead="+head.val);
    count++;

    while(temp!=null) {
//      System.out.println(temp.val);
      temp = temp.next;
    }
//    System.out.println("count="+ count);
  }

  /** Append a node of value val to the last element of the linked list. */
  public void addAtTail(int val) {
    if(head==null) {
      head = new ListNode(val, null);
      count++;
    }
    else{
      ListNode curr = head;
      while(curr.next!=null){
        curr = curr.next;
      }
      curr.next = new ListNode(val, null);
      count++;
    }
//    System.out.println("count="+ count);
  }

  /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
  public void addAtIndex(int index, int val) {
//    System.out.println("count="+ count);
    ListNode curr = head;
    if(index==count) curr.next = new ListNode(val, null);
    else{
      for(int i=1;i<index;i++){
//        System.out.println("adding after = "+ i);
        curr = curr.next;
      }
      curr.next = new ListNode(val, curr.next);
      count++;
    }
  }

  /** Delete the index-th node in the linked list, if the index is valid. */
  public void deleteAtIndex(int index) {
    ListNode curr = head;
    if (index==1) head=head.next;
    for(int i=1;i<index-1;i++){
      curr = curr.next;
    }
    curr.next = curr.next.next;
    count--;
//    System.out.println("count="+ count);
  }

  public void print(){
    System.out.print("printing...");
    ListNode curr = head;
    while(curr!=null){
      System.out.print(curr.val+":");
      curr = curr.next;
    }
  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
