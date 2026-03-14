import java.util.HashMap;

public class Hashcode{
	public static void main(String[] args) {
	    HashMap<Integer, String> map = new HashMap<>();
	    map.put(25, "Apple");
	    map.put(34, "Orange");
	    int hc = map.get(25).hashCode();
	    int index = hc & (16-1);
	    System.out.println(index);
	    System.out.println(hc);
	}
}
