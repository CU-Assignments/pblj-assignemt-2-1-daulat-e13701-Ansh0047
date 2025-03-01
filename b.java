import java.util.*;

class CardCollection {
    public static void main(String[] args) {
        Map<String, List<String>> cardMap = new HashMap<>();
        cardMap.put("Spades", Arrays.asList("A", "2", "3"));
        cardMap.put("Hearts", Arrays.asList("4", "5", "6"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter symbol to find cards:");
        String symbol = sc.next();

        if (cardMap.containsKey(symbol)) {
            System.out.println("Cards in " + symbol + ": " + cardMap.get(symbol));
        } else {
            System.out.println("Symbol not found!");
        }
    }
}
