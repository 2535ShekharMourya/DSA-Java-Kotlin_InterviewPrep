package problemSolving.LinkedList;

import java.util.Arrays;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class MainLinkedListJ {
    public static void main(String[] args) {
        ListNode head = createLinkedList(10);
        ListNode resNode = removeFirstNode(head);
        while (resNode !=null){
            System.out.println("--> "+resNode.val);
            resNode = resNode.next;
        }

    }

  /*  public static ListNode removeFromLast(ListNode head){
        ListNode curr = head;

    }*/
    public static ListNode removeFirstNode(ListNode head){
        return  head.next.next.next.next.next; // removing from beginning  O(1) time
    }


    public static ListNode reverseLinkedList(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static ListNode solveLinkedListProblem(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next !=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static boolean cycleInLinkedList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next !=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)return  true;
        }

        return false;
    }

    public static ListNode createLinkedList(int n) {

        if (n <= 0) return null;

        ListNode head = new ListNode(1);
        ListNode current = head;

        for (int i = 2; i <= n; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
      // current.next = head.next.next;           it is for cycle detection problem

        return head;
    }
}

