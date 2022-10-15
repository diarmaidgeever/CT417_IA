package mickeyMouseUniversity;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {

    private Student s1;
    private Student s2;
    private Module m1;
    private Module m2;
    private Course c1;
    private Lecturer l1;
    @BeforeEach
    void setUp() {
        c1 = new Course("Computer Science");
        s1 = new Student("John Cunniffe", new org.joda.time.LocalDate(2001, 3, 9), c1);
        s2 = new Student("Mary Towey", new org.joda.time.LocalDate(2001, 3, 9),c1);

        m1 = new Module("Software Engineering III","CT417",c1);
        m2 = new Module("Database Systems I","CT230",c1);

        l1 = new Lecturer("Martin Glavin", new LocalDate(1968,5,14));

    }
    @Test
    void addCourse() {
        m1.addCourse(c1);
        ArrayList<Course> courses = m1.getCourses();
        assertEquals(c1, courses.get(0));

    }

    @Test
    void addLecturer() {
        m1.addLecturer(l1);
        ArrayList<Lecturer> lecturers = m1.getLecturers();
        assertEquals(l1,lecturers.get(0));
    }

    @Test
    void addStudent() {
        m1.addStudent(s1);
        ArrayList<Student> students = m1.getStudents();
        assertEquals(s1,students.get(0));
    }

    @Test
    void removeStudent() {
        m1.addStudent(s1);
        m1.addStudent(s2);
        m1.removeStudent(s1);
        ArrayList<Student> students = m1.getStudents();
        assertEquals(false, students.contains(s1));
    }

    @Test
    void removeCourse() {
        m1.addCourse(c1);
        m1.removeCourse(c1);
        ArrayList<Course> courses = m1.getCourses();
        assertEquals(false, courses.contains(0));
    }

    @Test
    void removeLecturer() {
        m1.addLecturer(l1);
        m1.removeLecturer(l1);
        ArrayList<Lecturer> lecturers = m1.getLecturers();
        assertEquals(false, lecturers.contains(l1));
    }

    @Test
    void getModuleName() {
        assertEquals("CT417",m1.getModuleName());
    }

    @Test
    void setModuleName() {
        m1.setModuleName("EE445");
        assertEquals("EE445",m1.getModuleName());
    }

    @Test
    void getStudents() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        m1.setStudents(students);
        assertEquals(students, m1.getStudents());
    }

    @Test
    void setStudents() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        m1.setStudents(students);
        assertEquals(students, m1.getStudents());
    }

    @Test
    void getLecturers() {
        ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
        lecturers.add(l1);
        m1.setLecturers(lecturers);
        assertEquals(lecturers, m1.getLecturers());

    }

    @Test
    void setLecturers() {
        ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
        lecturers.add(l1);
        m1.setLecturers(lecturers);
        assertEquals(lecturers, m1.getLecturers());
    }

    @Test
    void getCourses() {
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        m1.setCourses(courses);
        assertEquals(courses, m1.getCourses());
    }

    @Test
    void setCourses() {
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        m1.setCourses(courses);
        assertEquals(courses, m1.getCourses());
    }

    @Test
    void getStartDate() {
        LocalDate startDate = new LocalDate(2,9,1);
        m1.setStartDate(startDate);
        assertEquals(startDate, m1.getStartDate());
    }

    @Test
    void setStartDate() {
        LocalDate startDate = new LocalDate(2,9,1);
        m1.setStartDate(startDate);
        assertEquals(startDate, m1.getStartDate());
    }

    @Test
    void getEndDate() {
        LocalDate endDate = new LocalDate(2,9,1);
        m1.setEndDate(endDate);
        assertEquals(endDate, m1.getEndDate());
    }

    @Test
    void setEndDate() {
        LocalDate endDate = new LocalDate(2,9,1);
        m1.setEndDate(endDate);
        assertEquals(endDate, m1.getEndDate());
    }

}