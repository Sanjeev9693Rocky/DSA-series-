//lec-18.10: A properties & method of parents class passes in the child class
//Types of Inheritance:
//1. Single lavel inheritance : in this it has single parent and child class


/* 

//eg: single lavel Inheritance

public class Inheritance {
    //creating Fish Objects
     public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
     }
}

//Base class (parents class)

class Animal {
    String color;

    void eat() {        //function
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breaths");
    }
}


//derived class (child class) 
class Fish extends Animal {
    int fins;

    void swim() {   //its own function and properties also
        System.out.println("swims in water");  

    }

}

*/

/* 
//Types 2 : Muilti level Inheritance (Animal -> Mammals -> Dog)

public class Inheritance {
    //creating Fish Objects
     public static void main(String[] args) {
        
        Dogs dobby = new Dogs();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
     }
}




//Base class (parents class)

class Animal {
    String color;

    void eat() {        //function
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breaths");
    }
}


//derived class (child class) 
class  Mammals extends Animal {
    int legs;

    
}


//derived class
class Dogs extends Mammals   {

    String breed; 
    
}

*/


//type 3: Hierarchical Inheritance : one perent class and multiple child class

public class Inheritance {
    //creating Fish Objects
     public static void main(String[] args) {
        
        Fish shark = new Fish();
        shark.eat();
        shark.swim(); 
        System.out.println(shark);
     }
}




//Base class (parents class)

class Animal {
    String color;

    void eat() {        //function
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}


//derived class (child class) 
class  Mammals extends Animal {
    void walk() {
        System.out.println("walk");
    }

    
}


//derived class
class Fish extends Animal   {

    void swim() {
        System.out.println("swims");
    }
    
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }

}