import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class q4
{
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 22);
        hashMap.put("David", 28);

        String keyToRetrieve = "Bob";
        if (hashMap.containsKey(keyToRetrieve)) {
            int value = hashMap.get(keyToRetrieve);
            System.out.println(keyToRetrieve + "'s age is " + value);
        } else {
            System.out.println(keyToRetrieve + " not found in the HashMap.");
        }

        String keyToCheck = "Eve";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " exists in the HashMap.");
        } else {
            System.out.println(keyToCheck + " does not exist in the HashMap.");
        }

        System.out.println("HashMap key-value pairs:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
