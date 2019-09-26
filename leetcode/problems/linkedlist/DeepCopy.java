package problems.linkedlist;

import java.util.Hashtable;

/**
 * @author amruta.kajrekar on 2/3/19.
 */
  // "static void main" must be defined in a public class.
public class DeepCopy {
    public static void main(String[] args) {
      DeepCopy main = new DeepCopy();
      RandomListNode head = new RandomListNode(1);
      RandomListNode node2 = new RandomListNode(2);
      RandomListNode node3 = new RandomListNode(3);
      head.next = node2;
      node2.next = node3;
      node3.next = null;
      head.random = null;
      node2.random = head;
      node3.random = head;
      main.copyRandomList(head);
    }

    public RandomListNode copyRandomList(RandomListNode head) {
      Hashtable<RandomListNode,RandomListNode> table = new Hashtable<RandomListNode,RandomListNode> ();

      RandomListNode ptr = head;
      while(ptr!=null){
        RandomListNode node = new RandomListNode(ptr.label);
        table.put(ptr,node);
        ptr = ptr.next;
        System.out.println("tab next");
      }

      ptr = head;
      while(ptr!=null){
        RandomListNode nn = table.get(ptr);
        if(ptr.next!=null)
          nn.next = table.get(ptr.next);
        if (ptr.random != null)
          nn.random = table.get(ptr.random);
        else
          nn.random = null;

        ptr = ptr.next;
        System.out.println("ptr next");
      }


      RandomListNode nnode = table.get(head);
      while(nnode!=null){
        System.out.println(nnode.label);
        nnode = nnode.next;
      }

      return table.get(head);
    }


    public RandomListNode copyRandomList2(RandomListNode head) {

      RandomListNode newHead = new RandomListNode(head.label);
      RandomListNode ptr = newHead;
      while(head.next!=null){
        int ran = -1;
        if(head.random!=null) ran = head.random.label;
        System.out.println(head.label+ "," + head.next.label + "," + ran);
        head=head.next;
      }
      int ran = -1,nxt = -1;
      if(head.random!=null) ran = head.random.label;
      if(head.next!=null) nxt = head.next.label;
      System.out.println(head.label+ "," + nxt + "," + ran);
      return ptr;
    }
  }

  class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
  }

