//lec-13.8 pairs of array

public class Pairs_Array {
    public static void printPairs(int numbers[]) {
        int totalPairs = 0;
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];   //2, 4, 6, 8, 10
            //inner loop
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")"); // print pairs

                totalPairs++;
            }
            System.out.println();
        }

        System.out.println("total pairs = " + totalPairs);  //print total no. of pairs

    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}
