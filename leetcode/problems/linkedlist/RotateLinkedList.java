package problems.linkedlist;

/**
 * @author amruta.kajrekar on 7/3/18.
 */
public class RotateLinkedList {

    public static void main(String[] args){
        RotateLinkedList list = new RotateLinkedList();
//        ListNode result = list.rotateRight(ListNode.getSampleLinkedList(), 3);
        ListNode result = list.partition(ListNode.getSampleSortedLinkedList(), 0);

        while(result!=null){
            System.out.print(result.val+",");
            result = result.next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        int len = 1;

        ListNode curr = head;
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }

        curr.next = head;
        ListNode result = curr;
        for(int i=0;i<len;i++){
            System.out.println("head = " + head.val);
            head = head.next;
        }
//        System.out.println("len="+len + ",k="+k);
        for(int i=1;i<(len-k);i++){
//            System.out.println("head="+head.val);
            head=head.next;
        }
        curr=head.next;
        head.next=null;
        return curr;
    }

    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode less = new ListNode(0);
        ListNode lessptr = less;
        ListNode more = new ListNode(0);
        ListNode moreptr = more;

        while(head!=null){
            if(head.val<x){
                lessptr.next = new ListNode(head.val);
                lessptr = lessptr.next;
            }
            else{
                moreptr.next = new ListNode(head.val);
                moreptr = moreptr.next;
            }
            head = head.next;
        }
        more = more.next;
        lessptr.next = more;

        return less.next;
    }

}
