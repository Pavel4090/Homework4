package homework10;

public class Document {
    private static String str;
    private static String s;

    public Document(String str) {
        this.str = str;
        this.s = str;
        System.out.println("String: " + str + "\n");
    }

    public static void twoFirstBlock() {
        String block1 = str.substring(0, 4);
        String block2 = str.substring(9, 13);
        System.out.println("Two first blocks: " + block1 + " " + block2 + "\n");
    }

    public static void lettersToStar() {
        char ch = '*';
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(5, ch);
        sb.setCharAt(6, ch);
        sb.setCharAt(7, ch);
        sb.setCharAt(14, ch);
        sb.setCharAt(15, ch);
        sb.setCharAt(16, ch);
        sb.setCharAt(19, ch);
        sb.setCharAt(21, ch);
        str = sb.toString();
        System.out.println(str + "\n");
    }

    public static void onlyLetters() {
        String s1 = s.toLowerCase();
        String block1 = s1.substring(5, 8);
        String block2 = s1.substring(14, 17);
        String letter1 = s1.substring(19, 20);
        String letter2 = s1.substring(21, 22);
        System.out.println(block1 + "/" + block2 + "/" + letter1 + "/" + letter2 + "\n");
    }

    public static void lettersInUpCase() {
        String s1 = s.toUpperCase();
        StringBuilder sb = new StringBuilder(s1);
        String block1 = sb.substring(5, 8);
        String block2 = sb.substring(14, 17);
        String letter1 = sb.substring(19, 20);
        String letter2 = sb.substring(21, 22);
        System.out.println("Letters:" + block1 + "/" + block2 + "/" + letter1 + "/" + letter2 + "\n");
    }

    public static void haveStringLetters() {
        String str1 = "abc";
        boolean result = s.regionMatches(true, 5, str1, 0, 3);
        if (!result) {
            System.out.println("This string hasnt symbols: abc");
        } else {
            System.out.println("This string has symbols: abc " + result + "\n");
        }
    }

    public static void isStringStarted555() {
        String str1 = "555";
        boolean result = s.regionMatches(0, str1, 0, 3);
        if (result) {
            System.out.println("This string started from: 555 " + result);
        } else {
            System.out.println("This string dont started from: 555 " + result + "\n");
        }
    }

    public static void isStringEnding1a2b() {
        String str1 = "1a2b";
        boolean result = s.regionMatches(18, str1, 0, 4);
        if (result) {
            System.out.println("This string ending from: 1a2b " + result);
        } else {
            System.out.println("This string dont ending from: 1a2b " + result + "\n");
        }
    }
}
