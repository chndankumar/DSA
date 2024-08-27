package Recursion;

public class targetSubSequent {
    public static void main(String[] args) {
        String str = "rabbbit";
        String tar = "rabbit";

        String temp = "";
        int res = GetSubsequent(str, tar, temp);
    }

    static int n = 0;

    private static int GetSubsequent(String str, String tar, String temp) {
        if (str.length() == 0 || temp.length() >= tar.length()) {
            if (temp == tar) {
                return n + 1;
            } else {
                return n;
            }
        }
        int res = GetSubsequent(str, tar, temp);
        int res1 = GetSubsequent(str, tar, temp);
    }
}
