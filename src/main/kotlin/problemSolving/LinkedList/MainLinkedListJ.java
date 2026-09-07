package problemSolving.LinkedList;

import java.util.Arrays;
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


    }

    public static ListNode solveLinkedListProblem(ListNode head){



        return head;
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

