/*
 * Merge two sorted linked list together to form a final sorted linked list
 */
package SinglyLinkedList;

public class MergeSorted {

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
    public void sort(ListNode a, ListNode b)
    {
        ListNode head1 = a;
        ListNode head2 = b;
        ListNode head = null;
        while(head1!= null && head2!=null)
        {
            if(head1.data>head2.data)
            {
                head.data = head2.data;
                head2 = head2.next;
            }
            else if(head1.data<head2.data)
            {
                head.data=head1.data;
                head1 = head1.next;
            }
            else
            {
                head.data=head1.data;
                head.next.data = head2.data;
                head1=head1.next;
                head2=head2.next;
            }
        }
        if(head1==null)
        {
            head.next=head2;
        }
        else
        {
            head.next=head1;
        }
    }
}
