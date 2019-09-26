package problems.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author amruta.kajrekar on 7/4/18.
 */
public class LinkedListComponent {
    public static void main(String[] args){
        LinkedListComponent comp = new LinkedListComponent();
        System.out.print(comp.numComponents(ListNode.getSampleSortedLinkedList(), new int[]{0,1,2}));
    }

    public int numComponents2(ListNode head, int[] G) {
        List<Integer> list = new ArrayList();
        int count=0;
        for(int i=0;i<G.length;i++){
            list.add(G[i]);
        }
        HashMap map = new HashMap();
        while(head!=null && head.next!=null){
            map.put(head.val, head.next.val);
            head=head.next;
        }
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer elem = it.next();
            if(list.contains(map.get(elem))){
                System.out.println(elem);
                count++;
//                it.forEachRemaining();
            }else if(map.containsKey(elem)){
                System.out.println(elem);
                count++;
                it.remove();
            }
        }
        return count;
    }

    public int numComponents(ListNode head, int[] G) {
        Set<Integer> Gset = new HashSet<>();
        for (int x: G) Gset.add(x);

        ListNode cur = head;
        int ans = 0;

        while (cur != null) {
            if (Gset.contains(cur.val) &&
                    (cur.next == null || !Gset.contains(cur.next.val)))
                ans++;
            cur = cur.next;
        }

        return ans;
    }
}
