package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "Haemin", 33, 95);

        Student student2 = new Student();
        initStudent(student2, "Fabio", 34, 90);

        printStudent(student1);
        printStudent(student2);

    }

    static void printStudent(Student student){
        System.out.printf("Name: %s, Age: %d, Grade: %d\n", student.name, student.age, student.grade);
    }

    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}
