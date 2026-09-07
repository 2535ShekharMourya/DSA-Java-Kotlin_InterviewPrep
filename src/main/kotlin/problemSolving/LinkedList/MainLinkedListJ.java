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

      /*  // Traverse LinkedList
        ListNode curr = head;
        while(curr !=null){
            System.out.print(curr.val + " --> ");
            curr = curr.next;
        }*/

        ListNode resNode = solveLinkedListProblem(head);
        System.out.println( "this is my middle node value " + resNode.val);


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

    public static ListNode createLinkedList(int n) {

        if (n <= 0) return null;

        ListNode head = new ListNode(1);
        ListNode current = head;

        for (int i = 2; i <= n; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        return head;
    }
}

