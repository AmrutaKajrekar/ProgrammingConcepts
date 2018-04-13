package problems.linkedlist;

import java.math.BigInteger;

/**
 * @author amruta.kajrekar
 * leetcode problem #2
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class AddingTwoNumbers {


    public static void main(String[] args){
//        ListNode node1 = new ListNode(3);
//        ListNode node2 = new ListNode(9);
//        ListNode node3 = new ListNode(9);
//        ListNode node4 = new ListNode(9);
//        ListNode node5 = new ListNode(9);
//        ListNode node6 = new ListNode(9);
//        ListNode node7 = new ListNode(9);
//        ListNode node8 = new ListNode(9);
//        ListNode node9 = new ListNode(9);
//        ListNode node10 = new ListNode(9);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = node8;
//        node8.next = node9;
//        node9.next = node10;

        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        node11.next=node12;
        node12.next=node13;
        ListNode node14 = new ListNode(5);
        ListNode node15 = new ListNode(6);
        ListNode node16 = new ListNode(4);
        node14.next=node15;
        node15.next=node16;
//        ListNode node5 = new ListNode(6);
//        ListNode node6 = new ListNode(4);
//        node4.next = node5;
//        node5.next = node6;

        //3,9,9,9,9,9,9,9,9,9
        //7
        AddingTwoNumbers add= new AddingTwoNumbers();
        ListNode result = add.addTwoNumbers(node11, node14);
        printNode(result);
    }

    private static void printNode(ListNode result) {

        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();

        while(l1!=null){
            str1.append(l1.val);
            l1=l1.next;
        }

        while(l2!=null){
            str2.append(l2.val);
            l2=l2.next;
        }
        BigInteger int1 = new BigInteger(str1.reverse().toString());
        BigInteger int2 = new BigInteger(str2.reverse().toString());

        String resultstr = String.valueOf(int1.add(int2));

        ListNode result = new ListNode(Character.getNumericValue(resultstr.charAt(resultstr.length()-1)));
        ListNode head = result;
       for (int i=resultstr.length()-2; i>=0; i--){
           ListNode node = new ListNode(Character.getNumericValue(resultstr.charAt(i)));
           head.next = node;
           head = node;
       }
        return result;
    }
}
