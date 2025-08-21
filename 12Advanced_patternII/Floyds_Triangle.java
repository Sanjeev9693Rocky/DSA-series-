public class Floyds_Triangle {
    public static void floyds_traingle(int n) {
        //outer loop
        int counter=1;
        for(int i=1; i<=n; i++) {
            //inner- how many timees will counter be printed
            for(int j=1; j<=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();;
        }
    }

    public static void main(String[] args) {
        floyds_traingle(5);
    }
}
