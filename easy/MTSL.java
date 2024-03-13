package easy;

import java.util.ArrayList;
import java.util.Collections;

public class MTSL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list = new ArrayList<>();
        while(list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(list);
        Collections.reverse(list);

        ListNode list3 = null;
        for(int i : list) {
            ListNode node = new ListNode(i);
            node.next = list3;
            list3 = node;
        }

        return list3;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(5);
        ListNode list2 = new ListNode(4);

        MTSL mtsl = new MTSL();
        ListNode list = mtsl.mergeTwoLists(list1, list2);
        while(list != null){
            System.out.println(list.val);
            list = list.next;
        }
        
    }
}


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }