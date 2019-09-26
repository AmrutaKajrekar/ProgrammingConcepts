package problems.linkedlist;

/**
 * @author amruta.kajrekar on 9/17/19.

/*
Implementing a Singly Linked List in Java using Class

1. Add a node with given integer value
2. Keep count of nodes created
3. Print linked list
4. Delete a node from top/head of the list
*/

public class MyLinked{

  int count =0 ;
  Node head;

  class Node{
    int data;
    Node next;

    public Node(int n){
      data = n;
      next = null;
    }
  }

  /** This add a new node at the end of the list
   */
  public Node add(int i){

    if(head==null){
      count++;
      head = new Node(i);
      return head;
    }

    Node curr = head;

    while(curr.next!=null){
      curr = curr.next;
    }
    count++;
    curr.next = new Node(i);

    return head;
  }

  /** Prints the singly list list*/
  public void print(){
    if(head==null) System.out.println("List is empty");
    Node curr = head;
    while(curr!=null){
      System.out.print(curr.data+ "->");
      curr = curr.next;
    }
    System.out.print("null\n");
    System.out.println("count=" + getCount());

  }


  /** Deletes a node from head of the list*/
  public void delete(){
    /*check for head == null*/
    if(head!=null){
      head = head.next;
      count--;
    }

    /* count--*/
  }

  public int getCount(){
    return count;
  }
  public static void main(String[] args){
    MyLinked list = new MyLinked();

    list.add(1);
    list.add(2);
    list.add(3);
    list.print(); //1,2,3
    list.delete();
    list.print();//2,3


  }

}
