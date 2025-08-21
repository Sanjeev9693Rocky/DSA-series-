//lec-7 : check if string is palindrome or not   "noon" or "racecar"

/*
public class Palindrome {
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();

            if(str.charAt(i) != str.charAt(n-1-i)) {
                //not a palindrome
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}

*/




//lec-8 Q. Given a route containing 4 directions(E, W, N, S), find the shortest path to reach destination.   "WNEENESENNN"

public class Palindrome{

    public static float getShortestPath(String path) {
        int x=0, y=0;

        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);

            //south
            if(dir == 'S') {
                y--;
            }

            //North
            else if(dir == 'N') {
                y++;
            } 

            //West
            else if(dir == 'W'){
                x--;
            }

            //East 
            else  {
                x++;
            }
        }

        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }



    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
        
    }
}