public class DuplicateNumbers {
    public static void main(String[] args)
    {
        int[] arr={4,2,7,8,2,3,7,1,9};
        boolean found=false;
        System.out.print("Duplicate Numbers:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i] +" ");
                    found=true;
                    break;
                }
            }
        }
        if(!found)
        {
            System.out.println("No duplicate");
        }
    }
    
}
