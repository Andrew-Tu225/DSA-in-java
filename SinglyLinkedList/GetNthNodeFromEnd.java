/*
 * get the nth element of linked list counted from the end
 */
package SinglyLinkedList;

public class GetNthNodeFromEnd {
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

    public ListNode getNthNode(int position)
    {
        ListNode mainPointer = head;
        ListNode refPointer = head;
        int counter = 0;
        
        //distance refPointer travel first will be remaining of mainPointer at the end
        while(counter < position)
        {
            refPointer = refPointer.next;
            counter++;
        }

        //travel until refPointer get to end
        while(refPointer != null)
        {
            refPointer = refPointer.next;
            mainPointer = mainPointer.next;
        }

        return mainPointer;
    }
}
