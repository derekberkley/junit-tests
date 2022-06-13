import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort noStudentsHere;
    Cohort oneStudentHere;
    Cohort MultStudentsHere;

//    TODO: Then create a CohortTest class and build a test for each of the following requirements:
//     A Cohort instance can add a Student to the List of students.
//     A Cohort instance can get the current List of students.
//     A Cohort instance can get the average, and it's being calculated correctly.

    @Before
    public void addStudentToListTest() {
        noStudentsHere = new Cohort();
        oneStudentHere = new Cohort();
        MultStudentsHere = new Cohort();

        Student tommy = new Student (1L, "Tommy");
        tommy.addGrade(95);
        tommy.addGrade(97);
        Student chuckie = new Student (2L, "Chuckie");
        chuckie.addGrade (91);
        chuckie.addGrade (95);

        oneStudentHere.addStudent(tommy);
        MultStudentsHere.addStudent(tommy);
        MultStudentsHere.addStudent(chuckie);
    }

    @Test
    public void testAddStudent(){
        MultStudentsHere.addStudent(new Student (3L, "Phil"));
        assertEquals("Phil", MultStudentsHere.getStudents().get(2).getName());
    }

    @Test
    public void testGetStudent() {
        assertEquals(0 , noStudentsHere.getStudents().size());
        assertEquals(1, oneStudentHere.getStudents().size());
        assertEquals(1, MultStudentsHere.getStudents().get(0).getId());
    }

    @Test
    public void testGradeAVG() {
        assertEquals(96, oneStudentHere.getCohortAverage(), 0);
    }



}
