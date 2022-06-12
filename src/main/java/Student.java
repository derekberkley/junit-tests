import java.util.ArrayList;

public class Student {

    // TODO: id should be a long number used to represent a "unique user" in our application.
    //  name is a String that holds the name of the student.
    //  grades is an ArrayList that contains a list of Integer numbers.
    public static long id;
    public static String name;
    public static ArrayList<Integer> grades;

    // TODO: The Student class should have a constructor that sets both the name and
    //  id property, it initializes the grades property as an empty ArrayList.
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    // returns the student's id
    public long getId() {return this.id;}

    // returns the student's name
    public String getName() {return this.name;}

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        this.grades.add(grade);
        System.out.println(this.grades);
    };

    // returns the list of grades
    public ArrayList<Integer> getGrades() {return this.grades;}

    // returns the average of the students grades
    public double getGradeAverage() {
    double sum = 0;
    double result = 0;
        for(double grade : this.grades) {
        sum += grade;
        result = sum / this.grades.size();
    };
//        System.out.println("average: " + result);
        return result;
};
}
