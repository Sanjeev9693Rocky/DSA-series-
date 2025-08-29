//lec-18.19,20
//Abstraction: Hiding all the unnecessary details and showing omly the important pats to the user



/* 
//1.Abstract class

public class Abstraction {
    
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        
    }
}


abstract class Animal {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

 class Horse extends Animal {
    void walk() {
        System.out.println("walks on 4 legs");
    }
 }

 class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
 }

 */


 //2.Interfaces


 public class Abstraction {
 
    public static void main(String[] args) {

        Queen q = new Queen();
        q.moves();
        
    }
 }


 interface  ChessPlayer {
 
    void moves();
 }

 class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, up, left, right, diagonal (in all 4 directions)");
    }
 }

 class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down. left, right");
    }
 }


 class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down. left, right, diagonal (by 1 steps)");
    }
 }