package Recursion;

public class printkeyCombination {
    public static void main(String[] args) {
        String str = "576";
        printCombination(str, "");
    }

    static String[] arr = { ".", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "w", "xyz" };

    private static void printCombination(String str, String temp) {

        if (str.length() == 0) {
            System.out.println(temp);
            return;
        }

        char ch = str.charAt(0);
        String key = arr[ch - '0'];

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            printCombination(str.substring(1), temp + c);
        }

    }

}
