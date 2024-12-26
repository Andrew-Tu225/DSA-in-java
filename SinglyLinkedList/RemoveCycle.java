package SinglyLinkedList;


public class RemoveCycle {

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
    
    public void removeLoop(ListNode fastPointer)
    {
        ListNode slowPointer = head;
        while(fastPointer.next.next != slowPointer.next)
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        fastPointer.next.next = null;
    }

    public void main()
    {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer!=null && fastPointer.next!=null)
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer==fastPointer)
            {
                removeLoop(fastPointer);
            }
        }
    }
}
