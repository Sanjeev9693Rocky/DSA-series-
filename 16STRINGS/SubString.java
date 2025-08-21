public class SubString {
    public static String sub_string(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        //Substring
        String str = "HelloWorld";
        System.out.println(sub_string(str, 0 , 5));
    }
}
