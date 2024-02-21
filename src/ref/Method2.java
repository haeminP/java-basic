package ref;

public class Method2 {
    public static void main(String[] args) {

        Student student1 = createStudent("Haemin", 33, 95);
        Student student2 = createStudent("Fabio", 34, 85);

        printStudent(student1);
        printStudent(student2);

    }

    static void printStudent(Student student){
        System.out.printf("Name: %s, Age: %d, Grade: %d\n", student.name, student.age, student.grade);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

}
