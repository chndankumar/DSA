public class toggleString {
    public static void main(String[] args) {
        String str = "pEPcoDInG";
        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            char temp;
            if (ch >= 'a' && ch <= 'z') {
                temp = (char) (ch - 'a' + 'A');
                str1.append(temp);
            } else if (ch >= 'A' && ch <= 'Z') {
                temp = (char) (ch - 'A' + 'a');
                str1.append(temp);
            }
        }
        System.out.println(str1);
    }
}
