import java.util.ArrayList;

public class q3
{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println("ArrayList elements: " + arrayList);

        int indexToRemove = 2;
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
            arrayList.remove(indexToRemove);
            System.out.println("Element at index " + indexToRemove + " removed.");
        } else {
            System.out.println("Invalid index. Element removal failed.");
        }

        int elementToCheck = 20;
        if (arrayList.contains(elementToCheck)) {
            System.out.println(elementToCheck + " exists in the ArrayList.");
        } else {
            System.out.println(elementToCheck + " does not exist in the ArrayList.");
        }

        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size);

        System.out.println("ArrayList elements:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
