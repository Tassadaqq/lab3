import java.util.ArrayList;
import java.util.Collections;

public class q8
{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(7);

        Collections.sort(arrayList);

        System.out.println("Sorted ArrayList (ascending order): " + arrayList);
    }
}