/*
 * insert a new node in a sorted linked list
 */
package SinglyLinkedList;

public class Insert {
    private ListNode head;
    private static class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int value)
    {
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data)
        {
            temp = current;
            current = current.next;
        }
        temp.next = newNode;
        newNode.next = current;
    }
}
