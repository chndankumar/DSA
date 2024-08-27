
public class stringCompression {
    public static void main(String[] args) {
        String str = "abcedef";
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0) {
                str1.append(ch);
                c++;
            } else if (ch == str.charAt(i - 1)) {
                c++;
            } else if (ch != str.charAt(i - 1)) {
                if (c > 1) {
                    str1.append(c);
                }
                c = 1;
                str1.append(ch);
            }
        }
        if (c > 1) {
            str1.append(c);
            c = 0;
        }
        System.out.println(str1);
    }
}