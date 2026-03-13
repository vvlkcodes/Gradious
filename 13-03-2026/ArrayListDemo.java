import java.util.ArrayList;

public class Main{
    public static void ArrayListDemo(String...args){
        ArrayList<String> list = new ArrayList<>();
        list.add("lalith kartheek");
        list.add("Rohan Oddam");
        list.add("Vishnu Vardhan");
        System.out.println(list);
        list.trimToSize();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.set(0, "vuppuluri venkata lalith kartheek");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.add("Yugs"));
        System.out.println(list.removeLast());
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("vuppuluri venkata lalith kartheek");
        list1.add("Rohan Oddam");
        list1.add("Vishnu Vardhan");
        System.out.println(list1);
        System.out.println(list.equals(list1));
    }
}
