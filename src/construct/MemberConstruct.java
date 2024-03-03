package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    // Construct overloading
    MemberConstruct(String name, int age){
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("Call constructor name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;

    }


}
