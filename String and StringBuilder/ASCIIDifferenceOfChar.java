public class ASCIIDifferenceOfChar {
    public static void main(String[] args) {

        String str = "adrjxg";
        StringBuilder res = new StringBuilder();
        res.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            int val = ch - str.charAt(i - 1);
            res.append(val);
            res.append(ch);
        }
        System.out.println(res);
    }
}
