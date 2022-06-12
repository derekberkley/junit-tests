import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {


    @Test
    public void testStudentConstructor() {
        assertNull(Student.id);
        assertNull(Student.name);
        assertNull(Student.grades);
    }

    public static void main(String[] args) {
        Student me = new Student(123L,"collin");
        System.out.println(me.getId());
        System.out.println(me.getName());
    }
}

