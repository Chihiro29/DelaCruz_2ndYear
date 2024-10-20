import java.util.HashMap;
public class HashMap2 {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();

        // add elements in the hashmap
        dictionary.put("Carry", "Buhat");
        dictionary.put("Lift", "Buhat");
        dictionary.put("Go", "Sulong");
        dictionary.put("Fast", "Mabilis");
        dictionary.put("Chicken", "Manok");
        dictionary.put("Telephone", "Telepono");
        dictionary.put("Black Board", "Pisara");
        dictionary.put("Water", "Tubig");
        dictionary.put("Chair", "Salumpuwit");
        dictionary.put("Pencil", "Lapis");

        System.out.println("HashMap: " + dictionary);
        String temp;
        temp = dictionary.get("Fast");
        System.out.println(temp);

        //show the keyset
        System.out.println("Keys: " + dictionary.keySet());
        System.out.println("Values: " + dictionary.values());
        System.out.println("EntrySet: " + dictionary.entrySet());
        dictionary.replace("Fast", "Quick");
        System.out.println("EntrySet: " + dictionary.entrySet());

        //remove
        dictionary.remove("Carry");
        System.out.println("EntrySet: " + dictionary.entrySet());
        System.out.println("Size of HashMap: " + dictionary.size());

        //check if the element is in the hashmap
        if (dictionary.containsKey ("Go"))
            System.out.println("Go is in the Map");
        else
            System.out.println("Not Found");

        dictionary.clear();
        System.out.println("EntrySet: " + dictionary.entrySet());
    }
}
