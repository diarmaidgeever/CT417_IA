package mickeyMouseUniversity;

import org.joda.time.*;
//import collegeStructure.Module;

import java.sql.Date;
import java.util.ArrayList;

public class Student {
    public static int iDCounter;
    private String name;
    private int age;

    private DateTime altdob; //for when you're just not sure
    private LocalDate dob;
    private String iD;
    private String username;
    private Course course;
    private ArrayList<Module> modules;

    public Student(String name, LocalDate dob, Course course) {
        //System.out.println("This is the constructor");
        this.name = name;
        this.dob = dob;
        this.course = course;
        LocalDate currentDate = new LocalDate(); //when a DateTime object is created with no value, it takes the current date as a value
        age = currentDate.getYear() - dob.getYear();//current year - year of birth
        username = getUsername();
        iD = getID();
        modules = new ArrayList<Module>();
        //System.out.println(iD);
        //modules.add(new Module("eeeeeee",course));
    }

    public String getUsername() {
        String genUsername;
        genUsername = name.replaceAll("\\s", "");
        genUsername = genUsername + age;
        //System.out.println(genUsername);
        return genUsername;

    }

    public String getID() {
        String genID;
        System.out.println(iDCounter);
        genID = "S" + iDCounter;
        iDCounter++;
        return genID;
    }

    public void addModule(Module module){
        modules.add(module);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules ) {
        this.modules = modules;
    }


    @Override
    public String toString() {
        String modulesList="";
        for (int i = 0; i < modules.size();i++){
            Module currentModule = modules.get(i);
            modulesList = modulesList + currentModule.getModuleName() + ", ";
        }
        return "\n      username: '" + username + '\'' +
                "\n         course: " + course.getName() +
                "\n         modules: " + modulesList;
    }
}
