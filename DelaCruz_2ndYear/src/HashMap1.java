import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args) {
        //create a hashmap
        HashMap<String, Integer> languages = new HashMap<>();
        // add elements in the hashmap
        languages.put("Java", 8);
        languages.put("Javascript", 1);
        languages.put("Python", 3);

        System.out.println("Hashmap: " + languages);
        int temp;
        temp = languages.get("Javascript");
        System.out.println(temp);

        //show the keyset
        System.out.println("Keys: " + languages.keySet());
        System.out.println("Values: " + languages.values());
        System.out.println("EntrySet: " + languages.entrySet());
        languages.replace("Javascript", 100);
        languages.replace("Python", 300);
        System.out.println("EntrySet: " + languages.entrySet());

        //remove python
        languages.remove("Python");
        System.out.println("EntrySet: " + languages.entrySet());
        System.out.println("Size of HashMap: " + languages.size());

        //check if java is in the hashmap
        if (languages.containsKey ("Java"))
            System.out.println("Java is in the Map");
        else
            System.out.println("Not Found");
        //System.out.println("Absent: " + languages.computeIfAbsent("Python", languages.size();

        languages.clear();
        System.out.println("EntrySet: " + languages.entrySet());
    }
}
