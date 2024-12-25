package SinglyLinkedList;

public class ReverseLinkedList
{
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

    public void reverse()
    {
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
    }
}