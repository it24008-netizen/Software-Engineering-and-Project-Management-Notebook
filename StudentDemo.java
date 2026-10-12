
class Student {
    int age;

    void display() {
        int marks = 85;

        System.out.println("Instance Variable (age): " + age);
        System.out.println("Local Variable (marks): " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();

        student.age = 20;

        System.out.println("Student Object Created");
        System.out.println("Object Identity Hash Code: "
                + System.identityHashCode(student));

        student.display();
    }
}
