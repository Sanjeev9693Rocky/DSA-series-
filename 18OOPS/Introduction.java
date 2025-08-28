//package 18OOPS;

//lec-18.1
//class : A class is like a blueprint or template.
//It defines attributes (variables) and behaviors (methods) that an object will have.

//object: An object is an instance of a class.
//When you create an object, memory is allocated, and you can access the class’s variables and methods.


public class Introduction {

    public static void main(String args[]) {
        Pen p1 = new Pen();   //created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);  //1st time print blue

        // change the color
        p1.setColor("red");
        System.out.println(p1.color);
    }
}    
    class Pen {
        String color;
        int tip;

        void setColor(String newColor) {   //function
            color = newColor;
        }

        void setTip(int newTip) {     //2nd function
            tip = newTip;
        }

        
    }

    class Student {
        String name;
        int age;
        float percentage; 

        void calcPercentage(int phy, int chem, int math) {
            percentage = (phy + chem + math) / 3;
        }
    }

