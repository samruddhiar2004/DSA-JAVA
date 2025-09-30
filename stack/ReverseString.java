import java.util.*;
public class ReverseString {
    public static void main(String[] args)
    {
        String str="hello";
        Stack<Character> st=new Stack<>();
        for(char c:str.toCharArray())
        {
            st.push(c);
        }
        StringBuilder reversed=new StringBuilder();
        while(!st.isEmpty())
        {
            reversed.append(st.pop());

        }
        System.out.println(reversed.toString());
    }
    
}
