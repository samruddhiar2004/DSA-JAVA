public class RotateArray {
    
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int k=2; //rotate by two position
        System.out.print("Original:");
        for(int n:arr) System.out.print(n +" ");
        //rotate logic
        int n=arr.length;
        int[] rotated= new int[n];
        for(int i=0;i<n;i++)
        {
            rotated[(i+k) % n]=arr[i];

        }
        System.out.println("\nRotated:");
        for(int num:rotated) System.out.print(num +" ");
    }
    
}

    

