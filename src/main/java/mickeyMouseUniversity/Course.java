package mickeyMouseUniversity;

import org.joda.time.*;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String name){
        students = new ArrayList<Student>();
        modules = new ArrayList<Module>();
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void addModule(Module module){
        modules.add(module);
    }

    public void removeModule(Module module){
        modules.remove(module);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
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

    public String ListModulesandStudents(){
        String modulesString = "";
        for (int i = 0; i < modules.size();i++){
            Module currentModule = modules.get(i);
            modulesString = modulesString + currentModule.listStudents();
        }

        return "________________________________________________________________________________________________\n" +
                name +  modulesString;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", modules=" + modules +
                '}';
    }
}
