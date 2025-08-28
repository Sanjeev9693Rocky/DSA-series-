//lec-18.15, 15.16 : Polymorpshim : Polymorphism means one thing (function, operator, or object) behaves in many different ways

//types 1 : method overloading : multiple functions with the same name but different parameters

/* 
public class Polymorphism {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(1, 2, 3));
        
    }
}


class Calculator {
    int sum (int a, int b) {
        return a + b;
    }


    float sum (float a, float b) {
        return a + b;
    }

    int sum (int a, int b, int c) {
        return a + b + c;
    }
}

*/



//lec-16.17 : 
//types 2 method overriding : parent and child classes both contain the same functuon with a different definition

public class Polymorphism {
    public static void main(String[] args) {

        Deer d = new Deer();
        d.eat();
        
    }
}



class Animal {
    void eat() {
        System.out.println("eats anythings");

    }
}


class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }

    
}


