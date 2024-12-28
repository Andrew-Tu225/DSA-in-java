public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    public class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList()
    {
        last=null;
        length = 0;
    }

    public int getLength()
    {
        return length;
    }

    public void circularSinglyLinkedList()
    {
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(1);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display()
    {
        if (last == null)
        {
            return;
        }
        ListNode first = last.next;
        while(first != last)
        {
            System.out.print(first.data + "-->");
            first = first.next;
        }
        System.out.print(first.data + " ");
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.circularSinglyLinkedList();
        csll.display();
    }
}
