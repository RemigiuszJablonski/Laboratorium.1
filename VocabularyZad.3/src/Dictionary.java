import java.util.*;
public class Dictionary {

    private static final Map<String, String> hashMapDictionary = new HashMap<>();
    private static final Map<String, String> treeMapDictionary = new TreeMap<>();

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean on = true;
        System.out.println("Welcome to Vocabulary application. You can enter words with their definition and display them with the HashMap or TreeMap");
while(on){
    System.out.println("Choose you option");
    System.out.println("1. Add word");
    System.out.println("2. Show vocabulary using HashMap");
    System.out.println("3. Show vocabulary using TreeMap");
    System.out.println("4. Compare HashMap with TreeMap");
    System.out.println("5. Leave vocabulary");
    int option = scanner.nextInt();
    scanner.nextLine();
    switch (option) {
        case 1 -> { addWord(scanner);
        }
        case 2 -> {dictionary(hashMapDictionary, "hashMap");
        }
        case 3 -> {dictionary(treeMapDictionary, "treeMap");
        }
        case 4 -> {compare();
        }
        case 5 -> { on = false;
            System.out.println("Thank you for using our dictionary");
        }
        default -> {
            System.out.println("Wrong number - enter one more time your option");
        }
    }
}
scanner.close();
    }

private static void addWord(Scanner scanner){
    System.out.println("Enter your word:");
    String word = scanner.nextLine();
    System.out.println("Enter your definition");
    String definition = scanner.nextLine();

    hashMapDictionary.put(word, definition);
    treeMapDictionary.put(word,definition);
    System.out.println("The words were added to the vocabulary");
}

private static void dictionary(Map<String, String> dictionary, String map){
System.out.println("Our dictionary" + map);
    for (String key : dictionary.keySet()) {
        System.out.println(key + ": " + dictionary.get(key));
    }
}

private static void compare(){
    System.out.println("\nCompare HashMap with TreeMap:");
    System.out.println("HashMap:");
    hashMapDictionary.keySet().forEach(key -> System.out.print(key + " "));
    System.out.println("\nTreeMap:");
    treeMapDictionary.keySet().forEach(key -> System.out.print(key + " "));
    System.out.println("\n" +
            "TreeMap always sorts the numbers and words. HashMap will not do that");
}
}



