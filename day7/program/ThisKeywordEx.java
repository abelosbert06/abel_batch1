public class ThisKeywordEx {

    public static void main(String[] args) {
        var student = new Student("Ethan", "22ee156", "cse");
        var student2 = new Student("Leon", "2233158");
        var student3 = new Student("gex", "22333i34", "ece");
        student.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}

class Student {

    String name;
    String rollno;
    String dept;

    public Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public Student(String name, String rollno, String dept) {
        this.name = name;
        this.rollno = rollno;
        this.dept = dept;
    }

    void displayInfo() {
        IO.println(name);
        IO.println(rollno);
        if (dept != null) {
            IO.println(dept);
        }
        IO.println(this.hashCode());
    }
}
