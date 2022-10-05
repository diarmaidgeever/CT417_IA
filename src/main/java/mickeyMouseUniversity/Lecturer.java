package mickeyMouseUniversity;

import org.joda.time.*;

public class Lecturer {
    public static int iDCounter;
    private String name;
    private int age;
    private LocalDate dob;
    private String iD;
    private String username;

    public Lecturer(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
        DateTime currentDate = new DateTime(); //when a DateTime object is created with no value, it takes the current date as a value
        age = currentDate.getYear() - dob.getYear();//current year - year of birth
        username = getUsername();
        iD= "L" + getID();
        System.out.println(iD);
    }

    public String getUsername() {
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


    public static void setiDCounter(int iDCounter) {
        Lecturer.iDCounter = iDCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
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
}
