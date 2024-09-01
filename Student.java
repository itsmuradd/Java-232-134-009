public class Student {
    private String name;

    ClassAverage classAvg = new ClassAverage();
    double average = classAvg.getAverage(); //implementing from ClassAverage.java

    private static int studentCount;

    public Student(String name, double average)
    {
        this.name = name;

        if(average > 0.0)
            if(average <= 100.0)
                this.average = average;
        studentCount++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAverage(double studentAverage)
    {
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }

    public double getAverage()
    {
        return average;
    }

    public static int getStudentCount()
    {
        return studentCount;
    }

    public String getLetterGrade()
    {
        String letterGrade = "";
        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }
}
