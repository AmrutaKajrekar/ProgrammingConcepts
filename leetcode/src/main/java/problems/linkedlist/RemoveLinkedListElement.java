package problems.linkedlist;

/**
 * @author amruta.kajrekar on 6/22/18.
 */
public class RemoveLinkedListElement {

    public static void main(String[] args){
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(6, node4);

        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1,node1);
        RemoveLinkedListElement list = new RemoveLinkedListElement();
        System.out.println(list.removeElements(head, 6));
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode start = head;
        if(head== null) return head;

        if(start!=null && start.val==val){
            ListNode temp = start.next;
            start=null;
            start = temp;
        }
        while(start !=null && start.next!=null){
            if(start.next.val == val){
                if(start.next.next!=null)
                    start.next.val = start.next.next.val;
                start.next = start.next.next;
            }
            start=start.next;
        }
        start = head;
        if(start!=null && start.next ==null && start.val==val) {
            start = null;
            return start;
        }
        if(start!=null && start.val==val && start.next==null) return null;
        return head;
    }

    public ListNode removeElements2(ListNode head, int val) {
        ListNode start = head;
        if(head== null) return head;
        if(head!=null && head.next ==null && head.val==val) {
            head = null;
            return head;
        }
        if(start!=null && start.val==val) start.next = start.next.next;
        while(start !=null && start.next!=null) {
            if (start.next.val == val) {
                start.next = start.next.next;
            }
            start = start.next;
        }

        ListNode print = head;
        while(print !=null ){
            System.out.println("start.val="+print.val);
            print=print.next;
        }
        return head;
    }
}
