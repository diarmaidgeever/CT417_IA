package mickeyMouseUniversity;

import org.aspectj.lang.annotation.Before;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

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

        m1 = new Module("CT417",c1);
        m2 = new Module("CT418",c1);

    }

    @Test
    void getUsername() {
        assertEquals("JohnCunniffe21",s1.getUsername());
    }

    @Test
    void getID() {
        assertEquals("S14",s1.getID());
    }

    @Test
    void addModule(){
        s1.addModule(m1);
        ArrayList<Module> modules = s1.getModules();
        assertEquals(m1,modules.get(0));
    }

    @Test
    void getName() {
        assertEquals("John Cunniffe", s1.getName());
    }

    @Test
    void setName() {
        s1.setName("Johnny Cunniffe");
        assertEquals("Johnny Cunniffe", s1.getName());
    }

    @Test
    void getDob() {

        assertEquals(new org.joda.time.LocalDate(2001, 3, 9),s1.getDob());
    }

    @Test
    void setDob() {
        LocalDate dob = new org.joda.time.LocalDate(2000, 10, 7);
        s1.setDob(dob);
        assertEquals(dob,s1.getDob());
    }

    @Test
    void getModules() {
        s1.addModule(m1);
        ArrayList<Module> modules = s1.getModules();
        assertEquals(m1,modules.get(0));
    }

    @Test
    void setModules() {
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(m1);
        modules.add(m2);
        s1.setModules(modules);
        assertEquals(modules,s1.getModules());
    }
}