package mickeyMouseUniversity;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    private Student s1;
    private Student s2;
    private Module m1;
    private Module m2;
    private Course c1;
    @BeforeEach
    void setUp() {
        c1 = new Course("Computer Science");
        s1 = new Student("John Cunniffe", new org.joda.time.LocalDate(2001, 3, 9), c1);
        s2 = new Student("Mary Towey", new org.joda.time.LocalDate(2001, 3, 9),c1);

        m1 = new Module("Software Engineering III","CT417",c1);
        m2 = new Module("Database Systems I","CT230",c1);


    }
    @Test
    void addStudent() {
        c1.addStudent(s1);
        ArrayList<Student> students = c1.getStudents();
        assertEquals(s1,students.get(0));
    }

    @Test
    void removeStudent() {
        c1.removeStudent(s1);
        ArrayList<Student> students = c1.getStudents();

        assertEquals(false,students.contains(s1));
    }

    @Test
    void addModule() {
        c1.addModule(m1);
        ArrayList<Module> modules = c1.getModules();
        assertEquals(m1,modules.get(0));
    }

    @Test
    void removeModule() {
        c1.removeModule(m1);
        ArrayList<Module> modules = c1.getModules();
        assertEquals(false,modules.contains(m1));
    }

    @Test
    void getName() {
        assertEquals("Computer Science",c1.getName());
    }

    @Test
    void setName() {
        c1.setName("Electronic and Computer Engineering");
        assertEquals("Electronic and Computer Engineering",c1.getName());
    }

    @Test
    void getModules() {
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(m1);
        modules.add(m2);
        c1.setModules(modules);
        assertEquals(modules,c1.getModules());
    }

    @Test
    void setModules() {
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(m1);
        modules.add(m2);
        c1.setModules(modules);
        assertEquals(modules,c1.getModules());
    }

    @Test
    void getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        c1.setStudents(students);
        assertEquals(students,c1.getStudents());
    }

    @Test
    void setStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        c1.setStudents(students);
        assertEquals(students,c1.getStudents());
    }

    @Test
    void getStartDate() {
        LocalDate startDate = new LocalDate(2002,5,6);
        c1.setStartDate(startDate);
        assertEquals(startDate, c1.getStartDate());
    }

    @Test
    void setStartDate() {
        LocalDate startDate = new LocalDate(2002,5,6);
        c1.setStartDate(startDate);
        assertEquals(startDate, c1.getStartDate());
    }

    @Test
    void getEndDate() {
        LocalDate endDate = new LocalDate(2005,4,26);
        c1.setEndDate(endDate);
        assertEquals(endDate, c1.getEndDate());
    }

    @Test
    void setEndDate() {
        LocalDate endDate = new LocalDate(2005,4,26);
        c1.setEndDate(endDate);
        assertEquals(endDate, c1.getEndDate());
    }

    @Test
    void listModulesandStudents() {
    }

    @Test
    void testToString() {
    }
}