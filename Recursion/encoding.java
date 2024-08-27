package Recursion;

public class encoding {
    public static void main(String[] args) {
        String str = "103";
        encode(str, "");
    }

    private static void encode(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res);
            return;
        }
        if (str.charAt(0) == '0') {
            return;
        }

        int n1 = Integer.parseInt(str.substring(0, 1));
        if (n1 != 0) {
            String str1 = arr[n1];
            encode(str.substring(1), res + str1);
        } else {
            return;
        }

        if (str.length() >= 2) {
            int n2 = Integer.parseInt(str.substring(0, 2));
            if (n2 <= 26) {
                String str2 = arr[n2];
                encode(str.substring(2), res + str2);
            } else {
                return;
            }
        }
    }

    static String[] arr = { "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

}
