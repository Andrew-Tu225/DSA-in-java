/*
 * Creating the Array as a class
 */
package Array;

public class Array
{
    int[] array;
    int nElement;

    public Array(int size)
    {
        array = new int[size];
        nElement = 0;
    }

    public void add(int element)
    {
        array[nElement] = element;
        nElement += 1;
    }

    public void remove(int element)
    {
        int i;
        for (i=0;i<array.length;i++)
        {
            if (array[i] == element)
            {
                break;
            }
        }
        if (i==nElement)
        {
            System.out.println(element + " not found");
        }
        else
        {
            for(int k=i;k<nElement-1;k++)
            {
                array[k] = array[k+1];
            }
            
            nElement -= 1;
            System.out.println(element + " is removed");
        }
    }

    public int[] reverseArray(int start, int end)
    {
        while(start < end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start ++;
            end --;
        }
        return array;
    }

    public void printElement()
    {
        for (int i=0;i<nElement;i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Array array = new Array(10);
        array.add(15);
        array.add(10);
        array.add(12);
        array.add(7);
        array.add(6);
        array.add(4);
        array.add(20);
        array.add(17);
        array.add(2);
        array.add(3);

        array.printElement();
    }
}