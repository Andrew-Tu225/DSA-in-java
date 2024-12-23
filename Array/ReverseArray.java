package Array;

public class ReverseArray {

    public static void reverse(int[] array, int start, int end)
    {
        while(start < end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) 
    {
        int[] array = {1,4,3,7,6,10};
        reverse(array,0,array.length-1);
        PrintArray.printElement(array, array.length);
    }
}
