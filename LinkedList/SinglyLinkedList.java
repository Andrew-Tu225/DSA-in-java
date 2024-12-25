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

    //insert new node as first element of linked list
    public void insertFirst(int value)
    {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //insert new node to last element of the linked list
    public void insertLast(int value)
    {
        ListNode newNode = new ListNode(value);
        if(head==null)
        {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
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
