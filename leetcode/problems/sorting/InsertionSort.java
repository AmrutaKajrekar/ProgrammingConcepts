package problems.sorting;

import problems.linkedlist.ListNode;

/**
 * @author amruta.kajrekar on 3/1/18.
 * leetcode problem #147: Insertion sorting on list
 *
 * Sort a linked list using insertion sort.
 */
public class InsertionSort {

    public static void main(String[] args){
        InsertionSort sort = new InsertionSort();
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.print(sort.insertionSortList(node1));
    }
    public ListNode insertionSortList(ListNode head) {

        ListNode curr = head;
        ListNode sorted = new ListNode(0);
        ListNode prev = sorted;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            while(prev.next!=null && prev.next.val <curr.val){
                prev = prev.next;
            }
            curr.next = prev.next;
            prev.next = curr;
            prev = sorted;
            curr = next;
        }
        return sorted.next;
    }

}
