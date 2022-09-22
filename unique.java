package UniqueCharStr;
public class unique {

	public static void main(String[] args) {
        String str = "Today is a good day";
        uniqueChar(str);
    }
    public static boolean uniqueChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            for (int x = i + 1; x < str.length(); x++) {
                char b = str.charAt(x);
                if (a == b) {
                    System.out.println("The word(s) '" + str + "'is not unique");
                    return true;
                }

            }
        }
        System.out.println("The word(s) " + str + "is unique");
        return false;
    }
}