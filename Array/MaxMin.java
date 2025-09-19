public class MaxMin {
    public static void main(String[] args)
    {
        int[] arr={10,20,4,45,99};
        int max=arr[0],min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];

        }
        System.out.println("Maximum=" +max);
        System.out.println("Mininum=" +min);
    }
    
}
