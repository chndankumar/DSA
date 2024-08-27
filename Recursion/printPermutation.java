package Recursion;

public class printPermutation {
    public static void main(String[] args) {
        String str = "abc";
        printAll(str, "");
    }

    private static void printAll(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String pre = str.substring(0, i);
            String post = str.substring(i + 1, str.length());
            char ch = str.charAt(i);
            printAll(pre + post, res + ch);
        }
    }
}
