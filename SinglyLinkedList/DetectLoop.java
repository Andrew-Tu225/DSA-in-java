package SinglyLinkedList;

public class DetectLoop{
    
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

    public boolean detect()
    {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while(fastPointer != null && fastPointer.next != null)
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(fastPointer == slowPointer)
                return true;
        }
        return false;
    }
}
