public class Student {
    private String firstName ;
    private String lastName ;
    private int courseNumber ;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Student ( String firstName, String lastName, int courseNumber){
        this.firstName= firstName;
        this.lastName = lastName;
        this.courseNumber=courseNumber;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student -" + courseNumber + " \n" );
        sb.append("firstName" + firstName + "\n" );
        sb.append("lastName" + lastName + "\n");

        return sb.toString();
    }
}
