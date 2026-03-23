public class BannerAppUC6 {

    // Method to generate O pattern
    public static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method to generate P pattern
    public static String[] getPPattern() {
        return new String[]{
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method to generate S pattern
    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Combine and print OOPS
        for (int i = 0; i < 7; i++) {
            System.out.println(
                o[i] + "   " +
                o[i] + "   " +
                p[i] + "   " +
                s[i]
            );
        }
    }
}