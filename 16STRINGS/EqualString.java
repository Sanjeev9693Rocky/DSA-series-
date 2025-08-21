//lec-9  String Function - compare



/* 

public class EqualString {
    public static void main(String args[]){
        String s1 = "Sanjeev";
        String s2 = "Sanjeev";
        String s3 = new String("Sanjeev");

        if(s1 == s2) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        if(s1 == s3) {
            System.out.println("String are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }
}

*/




public class EqualString {
    public static void main(String args[]){
        String s1 = "Sanjeev";
        String s2 = "Sanjeev";
        String s3 = new String("Sanjeev");

        if(s1 == s2) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        if(s1.equals(s3)) {
            System.out.println("String are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }
}
