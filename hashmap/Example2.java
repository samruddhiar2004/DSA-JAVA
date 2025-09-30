import java.util.HashMap;
public class Example2 {
    public static void main(String[] args)
    {
        int[] arr={1,2,2,3,1,4};
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int num:arr)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);

        }
        for(int key:freq.keySet())
        {
            System.out.println("Number" +key+ "appers" +freq.get(key) +"times");
        }
    }

    
}
