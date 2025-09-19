public class SecondLargest {
    public static void main(String[] args)
    {
        int[] arr={12,35,1,10,34,1};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first)
            {
                second=arr[i];
            }
        }
        if(second==Integer.MIN_VALUE)
        {
            System.out.println("No Second Largest Element");

        }
        else
        {
            System.out.println("Second Largest Number is:" +second);
        }
    }
    
}
