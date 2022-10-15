package mickeyMouseUniversity;

import org.joda.time.*;
import java.util.ArrayList;

public class Module {
    private ArrayList<Student> students;
    private ArrayList<Lecturer> lecturers;
    private ArrayList<Course> courses;
    private LocalDate startDate;
    private LocalDate endDate;
    private String moduleName;
    private String moduleCode;

    public Module(String moduleName, String moduleCode, Course course) {
        this.moduleName = moduleName;
        this.moduleName=moduleName;
        students = new ArrayList<Student>();
        lecturers = new ArrayList<Lecturer>();
        courses = new ArrayList<Course>();
        courses.add(course);

    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturers.remove(lecturer);
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(ArrayList<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String listStudents() {
        String studentsList = "";
        for (int i = 0; i < students.size(); i++) {
            Student currentStudent = students.get(i);
            studentsList = studentsList + currentStudent.toString();
        }
        return "\n\n    " + moduleName + studentsList;
    }

    @Override
    public String toString() {
        return "\nmoduleName: " + moduleName +
                "students: " + students;
    }
}
