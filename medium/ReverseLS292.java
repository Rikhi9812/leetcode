import java.util.*;

public class ReverseLS292{
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = null;
        if(head.next == null)
            return head;
        List<Integer> list= new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next; 
        }
        int size = list.size() -1;
        for(int i = size; i >= 0; i--){
            if(i+1 >= left && i+1 <= right){ 
            if(i+1 == left+1){
                ListNode newnode = new ListNode(list.get(right-1));
                newnode.next = node;
                node = newnode;
            } else if(i+1 == right-1){
                ListNode newnode = new ListNode(list.get(left-1));
                newnode.next = node;
                node = newnode;
                }
            } else {
                ListNode newnode = new ListNode(list.get(i));
                newnode.next = node;
                node = newnode;
            }
        }
        return node;
    }

    public static void main(String... args){

    }
    
}

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
