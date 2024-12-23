package Array;

public class RemoveElement 
{
    public static void remove(int[] array, int element)
    {
        int nElement = array.length;
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
            
            nElement-= 1;
            System.out.println(element + " is removed");
        }
    }

    public static void main(String[] args) 
    {
        int[] array = {3,4,6,7,2,9,10};
        remove(array,10);
    }

}
