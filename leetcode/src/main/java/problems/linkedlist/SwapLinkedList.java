package problems.linkedlist;

/**
 * @author amruta.kajrekar on 7/7/18.
 */
public class SwapLinkedList {
    public static void main(String[] args){
        SwapLinkedList list = new SwapLinkedList();
        list.swapPairs(ListNode.getSampleSortedLinkedList());
    }

    public ListNode swapPairs(ListNode head) {
        ListNode curr = head.next;
        ListNode prev = null;
        while(curr!=null){
            //swap curr & cur.next;
            System.out.println("curr.val "+ curr.val);
            prev = curr;
            System.out.println("prev.val "+ prev.val);
            curr = curr.next;
            System.out.println("curr.val "+ curr.val);
            prev.next = curr.next;
            System.out.println("prev.next.val "+ prev.next.val);
            curr.next = prev;
            System.out.println("curr.next.val "+ curr.next.val);
            curr=curr.next.next;
            System.out.println("ending loop with curr.val "+ curr.val);
            ListNode it = head;
            while(it!=null){
                System.out.println("it.val "+ it.val);
                it = it.next;
            }
        }
        return head;
    }

    public ListNode swapPairs2(ListNode head) {
        ListNode returnHead = head.next;
        ListNode prev = null;

        while(head!=null && head.next!=null){
            ListNode temp = head.next;
            head.next = head.next.next;
            temp.next = head;
            if(prev!=null) {
                prev.next = temp;
            }

        }

        return returnHead;
    }
}
