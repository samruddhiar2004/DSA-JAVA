import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int original=num;

        Stack<Integer> st=new Stack<>();
        while(num>0)
        {
            st.push(num%2);
            num/=2;
        }
        StringBuilder binary = new StringBuilder();
        while(!st.isEmpty())
        {
            binary.append(st.pop());
        }
        System.out.println("The binary of decimal number " +original+" is "+ binary.toString());
        sc.close();
    }
    
}
