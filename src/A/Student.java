package A;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college ="codegym";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}

class Test {
    public static void main(String[] args) {
        Student.change();
        Student obj1 = new Student(1,"name1");
        Student obj2 = new Student(2,"name2");
        Student obj3 = new Student(3,"name3");
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
