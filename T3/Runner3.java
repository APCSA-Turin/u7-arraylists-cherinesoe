import java.util.ArrayList;

public class Runner3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();        
        words.add("candle");
        words.add("dandelion");
        words.add("eagle");
        words.add("garage");
        words.add("hamburger");
        words.add("imitate");
        words.add("jello");

        // use a for loop here to print out the words in reverse order
        // for (int i = words.size() - 1; i >= 0; i--) {
        //     System.out.println(words.get(i));
        // }

        for (int i = 0; i < words.size(); i++) {
            String first = words.get(i).substring(0, 1);
            if (first.equals("h")) {
                i = words.size();
            } else {
                System.out.println(words.get(i));
            }
        }
    }
}