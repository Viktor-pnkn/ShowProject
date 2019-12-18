import java.util.ArrayList;
import java.util.Iterator;

public class Iter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(32);
        list.add(44);
        Iterator<Integer> iterator = list.iterator();
        iterator.next();
        System.out.println(iterator.equals(1));
    }
}
