/*
 * basic implementation of double linked list
 */
package DoublyLinkedList;

public class doubleLinkedList 
{
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode
    {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data)
        {
            this.data=data;
        }
    }

    public doubleLinkedList()
    {
        head = null;
        tail = null;
        length = 0;
    }

    public boolean isEmpty()
    {
        return length==0;
    }

    public int length()
    {
        return length;
    }
    public void displayForward()
    {
        ListNode temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void displayBackward()
    {
        ListNode temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.print("null");
    }

    public void insert(int position, int value)
    {
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        int counter = 0;
        while(counter<position-1)
        {
            current = current.next;
        }
        ListNode previous = current.previous;
        previous.next = newNode;
        newNode.previous = previous;
        newNode.next = current;
        current.previous = newNode;
    }

    public void delete(int position)
    {
        ListNode current = head;
        int counter = 0;
        while(counter<position-1)
        {
            current = current.next;
        }
        ListNode previous = current.previous;
        ListNode next = current.next;
        previous.next = next;
        next.previous = previous;
    }
}

