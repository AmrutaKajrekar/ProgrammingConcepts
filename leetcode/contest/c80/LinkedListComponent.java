package contest.c80;

import problems.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar on 4/14/18.
 * 817. Linked List Components

We are given head, the head node of a linked list containing unique integer values.
We are also given the list G, a subset of the values in the linked list.
Return the number of connected components in G, where two values are connected if they appear consecutively in the linked list.

Example 1:
Input:
head: 0->1->2->3
G = [0, 1, 3]
Output: 2
Explanation:
0 and 1 are connected, so [0, 1] and [3] are the two connected components.
Example 2:

Input:
head: 0->1->2->3->4
G = [0, 3, 1, 4]
Output: 2
Explanation:
0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.
Note:

If N is the length of the linked list given by head, 1 <= N <= 10000.
The value of each node in the linked list will be in the range [0, N - 1].
1 <= G.length <= 10000.
G is a subset of all values in the linked list.
 */
public class LinkedListComponent {

    public static void main(String[] args){
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        LinkedListComponent comp = new LinkedListComponent();
        System.out.print(comp.numComponents(head,new int[]{0,3,1,4}));
    }

    int[] Global;
    ArrayList<List> lists = new ArrayList<List>();

    public int numComponents(ListNode head, int[] G) {
        //iterate through the head
        //remove and put the ele from G into another list<list>
        //return the total count of list.
        Global=G;
        while(head.next!=null){
            isConsecutive(head.val,head.next.val);
            head = head.next;
        }
        return lists.size();
    }

    private boolean isConsecutive(int head, int head2) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i : Global)
        {
            list.add(i);
        }

        boolean headExists = false;
        boolean head2Exists = false;
        if(list.contains(head)){
            headExists=true;
            list.remove((Object)head);
        }
        if(list.contains(head2)){
            head2Exists=true;
            list.remove((Object)head2);
        }

        if(headExists&&head2Exists) {
            Global = new int[list.size()];
            int k = 0;
            for (int i : list) {
                Global[k] = i;
                k++;
            }

            ArrayList temp = new ArrayList<>();
            temp.add(head);
            temp.add(head2);
            lists.add(temp);

        }else if(headExists){
            ArrayList temp = new ArrayList<>();
            temp.add(head);
            lists.add(temp);
        }
        else if(head2Exists){
            ArrayList temp = new ArrayList<>();
            temp.add(head2);
            lists.add(temp);
        }
        return headExists&&head2Exists;
    }

    private boolean isConsecutive2(ListNode head, int a, int b) {
        while(head.next!=null){
            if(head.val<=a) {
                if (head.val == a && head.next.val == b)
                    return true;
                head = head.next;
            }
            else break;
        }

        return false;
    }
}
