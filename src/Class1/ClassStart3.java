package Class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();

        student1.name = "student1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "student2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("Name: " + student1.name + " Age: " + student1.age);
        System.out.println("Name: " + student2.name + " Age: " + student2.age);
    }



}
