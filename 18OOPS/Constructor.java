
/* 


public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("sanjeev");
        System.out.println(s1.name);
    }
}


 class  Student {

    String name;
    int roll;

    Student(String name) {      //constructor
        this.name = name;
    }
}

*/


//lec-18.7

//copy constructor


public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();   // default constructor
        s1.name = "sanjeev";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // Copy constructor (deep copy)
        Student s2 = new Student(s1);
        s2.password = "xyz";  // change password only

        // print s2 marks
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Default constructor
    Student() {
        marks = new int[3];
    }

    // Copy constructor (Deep Copy)
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;

        // Deep copy of marks array
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
