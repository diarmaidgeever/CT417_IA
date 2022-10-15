package mickeyMouseUniversity;

import org.joda.time.*;

import java.util.ArrayList;

public class Lecturer {
    public static int iDCounter;
    private String name;
    private int age;
    private LocalDate dob;
    private String iD;
    private String username;

    private ArrayList<Module> modules;

    public Lecturer(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
        DateTime currentDate = new DateTime(); //when a DateTime object is created with no value, it takes the current date as a value
        age = currentDate.getYear() - dob.getYear();//current year - year of birth
        username = genUsername();
        iD= "L" + getID();
        System.out.println(iD);
    }

    public String genUsername() {
        String genUsername;
        genUsername = name.replaceAll("\\s", "");
        genUsername = genUsername + age;
        System.out.println(genUsername);
        return genUsername;

    }

    public int getID() {
        int genID;
        genID = iDCounter;
        iDCounter++;
        return genID;
    }

    public void addModule(Module module){
        modules.add(module);
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getDob() {
        return dob;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules ) {
        this.modules = modules;
    }

    public String getName() {
        return name;
    }


}
