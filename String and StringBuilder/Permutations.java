
public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        int num = factorial(str.length());

        for (int i = 0; i < num; i++) {
            int d = i;
            StringBuilder sb = new StringBuilder(str);

            for (int j = str.length() - 1; j >= 0; j--) {
                int n = d % j;
                d = d / j;
                char ch = sb.charAt(n);
                sb.deleteCharAt(n);
            }
        }
    }

    private static int factorial(int length) {
        int i = 1;
        int res = 1;
        while (i <= length) {
            res = res * i;
        }
        return res;
    }
}
