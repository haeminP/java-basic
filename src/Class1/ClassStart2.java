package Class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentsNames = {"student1", "student2", "student3"};
        int[] studentAges = {15, 16, 17};
        int[] studentGrades = {90, 80, 80};

        for (int i = 0; i < studentGrades.length; i++){
            System.out.println("Name: " + studentsNames[i] + " Age: " + studentAges[i] + " Grade: " + studentGrades[i]);
        }

        

    }
}
