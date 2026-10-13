import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();

        // insertion
        mapping.put("in", "India");
        mapping.put("en", "Engliand");
        mapping.put("us", "United States");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "brazil");

        System.out.println("Before: " + table);
        table.putAll(mapping);

        System.out.println("After: " + table);

        // deletion
        table.remove("en");
        System.out.println(table);

        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("usa", "None"));

        System.out.println(table.containsKey("in"));

        System.out.println(table.containsValue("United States"));

        System.out.println(table);

        table.replace("in", "America");
        System.out.println(table);

        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        Set<Map.Entry<String, String>> entrySet = table.entrySet();
        System.out.println("Printing entries: " + entrySet);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }
}