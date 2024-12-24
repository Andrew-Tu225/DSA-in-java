/*
 * push all zero in the array to the very end without changing the order of the nonzero numbers
 */
package Array;

public class PushZeroToEnd {
    public static void pushZero(int[] array)
    {
        int j=0;     //track zero's index
        for(int i=0;i<array.length;i++)  //i track non zero's index
        {
            if(array[i] !=0 && array[j] == 0)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
            if(array[j] != 0)
            {
                j++;
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] array = {8,1,0,2,1,0,3};
        pushZero(array);
        PrintArray.printElement(array, array.length);
    }
}
