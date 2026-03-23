import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {

    // Method to create and return character patterns
    public static Map<Character, String[]> getPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[]{
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        return map;
    }

    // Method to display banner
    public static void printBanner(String text, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append("   ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = getPatterns();

        String text = "OOPS";

        printBanner(text, patterns);
    }
}