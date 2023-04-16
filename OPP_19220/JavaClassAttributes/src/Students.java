public class Students {
    private String firstName;
    private String lastName;
    private int courseName;

    // Constructor default
    public Students() {
        this.firstName = "Mihaela";
        this.lastName = "Mihaylova";
        this.courseName = 19220;
    }

    //Constructor with params
    public Students(String firstName, String lastName, int courseName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName){
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCourseName(int courseName){
        this.courseName=courseName;
    }

    public int getCourseName() {
        return courseName;
    }
}

