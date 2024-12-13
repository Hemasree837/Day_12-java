import java.util.*;
class Linkedlist{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("hii");
        a.add("hello");
        a.add("how are you");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}