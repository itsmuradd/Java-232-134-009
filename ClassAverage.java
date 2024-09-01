import java.util.Scanner;
public class ClassAverage {
    private int total = 0;
    private double average;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter <= 10)
        {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        int average = total / 10;
        System.out.printf("%ntotal of all 10 grade is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
    public double getAverage()
    {
        return average;
    }
}
