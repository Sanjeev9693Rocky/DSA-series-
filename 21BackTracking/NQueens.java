//lec- 21.8: it is normally for not actually , it is only for normal just 25 %

//Qs. Place N queens on an NxN cheshboard such that no 2 queens cannot attack each other N = 4


/* 


public class NQueens {

    public static void nQueens(char board[][], int row) {

        //base case
        if(row == board.length) {
            printBoard(board);
            return;
        }


        //column loop
        for(int j=0; j<board.length; j++) {
            board[row][j] = 'Q';
            nQueens(board, row+1);    //function call
            board[row][j] = 'X';      //backtracking step      is blanks
        }
    }

    //function of board
    public static void printBoard(char board[][]) {
        System.out.println("----------------chess board------------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }

    } 


    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        //initialize 
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);
    }
}

*/

/* 

//lec- 21.8 & 9 & 10: in this complete N - Queens sol



public class NQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void nQueens(char board[][], int row) {

        //base case
        if(row == board.length) {
             printBoard(board);
            count++;
            return;
        }


        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);    //function call
                board[row][j] = 'X';      //backtracking step      is blanks
            }
            
        }
    }

    //function of board
    public static void printBoard(char board[][]) {
        System.out.println("----------------chess board------------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }

    } 

    static int count = 0;


    public static void main(String[] args) {
        int n = 5;  //n=5 also the result is 10
        char board[][] = new char[n][n];

        //initialize 
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);
        System.out.println("total ways to solve n queens = " + count);
    }
}

*/

//Time complexity is O(n!)
//aslo recurence relation is   T(n) = n*T(n-1) + isSafe()


//lec-21.11 : N-Queens - print 1 solution (modify in this n-queens) :  Check if problem can solved & print only 1 solution to N Queens problem





public class NQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static boolean nQueens(char board[][], int row) {

        //base case
        if(row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }


        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }

                    board[row][j] = 'X';      //backtracking step      is blanks
                    
                
            }
            
        }
        return false;
    }

    //function of board
    public static void printBoard(char board[][]) {
        System.out.println("----------------chess board------------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }

    } 

    static int count = 0;


    public static void main(String[] args) {
        int n = 4;  //n=5 also the result is 10
        char board[][] = new char[n][n];

        //initialize 
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }

        if(nQueens(board, 0)) {
            System.out.println("solution is possible");
            printBoard(board);
        } else {
            System.out.println("solution is not possible");
        }

        // System.out.println("total ways to solve n queens = " + count);
        
    }
}
