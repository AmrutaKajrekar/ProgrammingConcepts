package problems.linkedlist;

/**
 * @author amruta.kajrekar on 6/27/18.
 */
public class SinglyLinkedListFunc {

    public static void main(String[] args){
        ListNode node7 = new ListNode(1);
        ListNode node6 = new ListNode(2, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1,node2);

        SinglyLinkedListFunc fun = new SinglyLinkedListFunc();
//        fun.printLinkList(fun.reverseList(node1));
//        fun.printLinkList(fun.recursivereverse(node1));
        System.out.println(fun.isPalindrome(node1));
    }


    public void printLinkList(ListNode node){
        while(node!=null){
            System.out.print(node.val + "=");
            node = node.next;
        }
    }

    public ListNode reverseList(ListNode node){
        System.out.print("Reverse List = ");
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private ListNode recursivereverse(ListNode node) {
        if(node.next==null) return node;
        ListNode returnn = recursivereverse(node.next);
        node.next.next = node;
        node.next = null;
        return returnn;
    }

    public boolean isPalindrome(ListNode node){
        ListNode slow = node;
        ListNode fast = node;

        while(slow!=null && fast!=null&& fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head = slow;
        SinglyLinkedListFunc fun = new SinglyLinkedListFunc();
        head = fun.recursivereverse(head);

        while(node!=slow && head!=null){
            if(node.val!=head.val) return false;
            node= node.next;
            head= head.next;
        }
        return true;
    }
}
