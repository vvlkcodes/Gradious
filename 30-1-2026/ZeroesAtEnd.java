import java.util.ArrayList;
import java.util.List;

public class ZeroesAtEnd {
    public static void main(String[] args) {
        int[] arr = { 1,2,0,0,0,4,0,1,0,5,0};
        List<Integer> list = new ArrayList<Integer>();
        for(int x : arr){
            if(x==0){
                list.add(0,x);
            }else{
                list.add(x);
            }
        }
        for( int x : list){
            System.out.print(x+" ");
        }
    }
}