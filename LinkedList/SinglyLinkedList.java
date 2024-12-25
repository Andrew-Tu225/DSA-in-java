/*
 * basic implementation of linked list for different method
 */
package LinkedList;

public class SinglyLinkedList 
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

    public void display()
    {
        ListNode current = head;
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    //insert a new node to a linked list at given position
    public void insert(int position, int value)
    {
        ListNode newNode = new ListNode(value);
        if (position==1)
        {
            newNode.next = head;
            head = newNode;
        }

        int counter = 1;
        ListNode previous = head;
        while(counter < position-1)
        {
            counter += 1;
            previous = previous.next;
        }
        ListNode current = previous.next;
        previous.next = newNode;
        newNode.next = current;
    }

    //delete a node at the given position from the linked List
    public void delete(int position)
    {
        if(head == null)
        {
            return;
        }
        ListNode previous = head;
        int counter = 1;
        while(counter < position - 1)
        {
            counter++;
            previous = previous.next;
        }
        ListNode current = previous.next;
        previous.next = current.next;
        current.next = null;
    }

    public static void main(String[] args) 
    {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(8);

        //chain to form the linked list
        sll.head.next = second;   //10 --> 1
        second.next = third;      //10 --> 1 --> 5
        third.next = fourth;      //10 --> 1 --> 5 --> 8 --> null

        sll.display();
    }
}
