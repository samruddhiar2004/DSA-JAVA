import java.util.HashMap;
public class Example1 {
    public static void main(String[] args)
    {
        HashMap<String,Integer> marks=new HashMap<>();
        marks.put("Atul",99);
        marks.put("Swati",100);
        marks.put("Ladu",98);
        System.out.println("Rahul marks:" +marks.get("Atul"));
        System.out.println("Total students:" +marks.size());
    }
    
}
