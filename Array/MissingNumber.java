/*
 * Given an array n-1 distinct number in a range of 1 to n, find the missing number
 */
package Array;

public class MissingNumber 
{
    public static int missingNumber(int[] array, int n)
    {
        int totalSum = n*(n+1)/2;
        for(int i=0;i<array.length;i++)
        {
            totalSum -= array[i];
        }

        return totalSum;
    }

    public static void main(String[] args) 
    {
        int[] array = {1,3,5,4,6};
        int missing = missingNumber(array, 6);
        System.out.println(missing);
    }
}
