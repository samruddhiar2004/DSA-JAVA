public class LeadersInArray {
    //A leader is an element that is greater than all the elements to its right
    public static void main(String[] args)
    {
        int[] arr={16,17,4,3,5,2};
        System.out.print("Leaders:");
        int maxfromright=arr[arr.length-1];
        System.out.print(maxfromright + " ");
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>maxfromright)
            {
                maxfromright=arr[i];
                System.out.print(maxfromright + " ");
            }
        }
        


    }
        
    
}
