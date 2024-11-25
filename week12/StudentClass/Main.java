package week12.StudentClass;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice",20);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Bob");
        student.setAge(25);

        student.setAge(-5);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
