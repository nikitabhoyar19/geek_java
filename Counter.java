//Java Program to illustrate the use of static variable which  
//is shared with all objects.  
class Counter {
    static int count = 0;// will get memory only once and retain its value

    Counter() {
        count++;// incrementing the value of static variable
        System.out.println(count);
    }

    public static void main(String args[]) {
        // creating objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // count is defined as static variable therefore it is printing 1 2 3
        // if it is not static then it will print 1 for all object or instance

    }
}

// static method programme
/*
 * class Student{ int rollno; String name; static String college = "ITS";
 * 
 * // static method to change the value of static variable static void change()
 * { college = "BBDIT"; }
 * 
 * // constructor to initialize the variable // Student(int r, String n){ rollno
 * = r; name = n; }
 * 
 * method to display values void
 * display(){System.out.println(rollno+" "+name+" "+college);} }
 * 
 * 
 * public class TestStaticMethod{ public static void main(String args[]){
 * Student.change(); //calling change method
 * 
 * Student s1 = new Student(111,"Karan"); Student s2 = new Student(222,"Aryan");
 * Student s3 = new Student(333,"Sonoo");
 * 
 * s1.display(); s2.display(); s3.display(); } }
 * 
 */