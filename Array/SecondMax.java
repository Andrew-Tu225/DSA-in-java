/*
 * Given an array of integers, return the second max value. 
 */
package Array;

public class SecondMax 
{
    public static int getSecondMax(int[] array)
    {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++)
        {
            if (array[i] > max)
            {
                secondMax = max;
                max = array[i];
            }
            else if(array[i]>secondMax && array[i] != max)
            {
                secondMax = array[i];
            }
        }

        return secondMax;
    }
}
