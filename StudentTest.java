public class StudentTest {
    public static void main(String[] args)
    {
        Student account1 = new Student("Jamal Black", 93.5);
        Student account2 = new Student("Kamal White", 77.75);


        System.out.printf("%s's letter grade is : %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is : %s%n", account2.getName(), account2.getLetterGrade());
        System.out.println("Total student count is: " + Student.getStudentCount());
    }
}
