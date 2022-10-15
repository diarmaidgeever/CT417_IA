package mickeyMouseUniversity;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {
    private Lecturer l1;
    private Student s2;
    private Module m1;
    private Module m2;
    private Course c1;
    @BeforeEach
    void setUp() {
        l1 = new Lecturer("John Cunniffe", new org.joda.time.LocalDate(2001, 3, 9));
        //The constructor is called for each test so the idCounter will increment for every test conducted.
        //I'm too tired to think about how to fix it now, but you had better change it ya flute!!!
        //s2 = new Student("Mary Towey", new org.joda.time.LocalDate(2001, 3, 9),c1);

        m1 = new Module("Software Engineering III","CT417",c1);
        m2 = new Module("DataBase Systems I","CT230",c1);

    }

    @Test
    void genUsername() {
        assertEquals("JohnCunniffe21",l1.genUsername());
    }

    @Test
    void genID() {
        assertEquals("L"+ Lecturer.iDCounter,l1.genID());
    }


    @Test
    void setName() {
        l1.setName("Johnny Cunniffe");
        assertEquals("Johnny Cunniffe", l1.getName());
    }

    @Test
    void setDob() {
        LocalDate dob = new org.joda.time.LocalDate(2000, 10, 7);
        l1.setDob(dob);
        assertEquals(dob,l1.getDob());
    }

    @Test
    void setModules() {
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(m1);
        modules.add(m2);
        l1.setModules(modules);
        assertEquals(modules,l1.getModules());
    }

    @Test
    void getModules() {
        l1.addModule(m1);
        ArrayList<Module> modules = l1.getModules();
        assertEquals(m1,modules.get(0));
    }
}