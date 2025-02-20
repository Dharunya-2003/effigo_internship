package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> hm = new HashMap<>();

        // Adding key-value pairs
        hm.put(101, "sam");
        hm.put(102, "ram");
        hm.put(103, "Dharunya");
        hm.put(104, "manasa");
        hm.put(102, "anvith"); 
        System.out.println(hm); // Printing the HashMap

        // Getting the size of the HashMap
        System.out.println("Size of HashMap: " + hm.size());

        // Removing a key-value pair
        hm.remove(104);
        System.out.println("After removing pair: " + hm);

        // Fetching value for a specific key
        System.out.println("Value for key 102: " + hm.get(102));

        // Getting all keys
        System.out.println("Keys in HashMap: " + hm.keySet());

        // Getting all values
        System.out.println("Values in HashMap: " + hm.values());

        // Getting all key-value pairs
        System.out.println("Entries in HashMap: " + hm.entrySet());

        // Iterating using for-each loop
        for (int k : hm.keySet()) {
            System.out.println(k + " => " + hm.get(k));
        }

        // Iterating using Iterator
        Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Clearing the HashMap
        hm.clear();
        System.out.println("Is HashMap empty? " + hm.isEmpty());
    }
}
