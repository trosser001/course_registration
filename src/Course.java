import java.util.*;

public class Course {

    private String name;
    private Student[] roster, waitlist;
    private int maxRosterStudents, maxWaitlistStudents;
    private int numOnRoster, numOnWaitlist;

    public static void main(String[] args) {
        Course c = new Course("CS111b", 3, 4);
        System.out.println(c);

    }

    public Course(String name, int maxRosterStudents, int maxWaitlistStudents) {
        this.name = name;
        this.maxWaitlistStudents = maxWaitlistStudents;
        this.maxRosterStudents = maxRosterStudents;
        this.roster = new Student[maxRosterStudents];
        this.waitlist = new Student[maxWaitlistStudents];
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getRoster() {
        return this.roster;
    }

    public Student[] getWaitlist() {
        return this.waitlist;
    }

    public int getMaxRosterStudents() {
        return this.maxRosterStudents;
    }

    public int getMaxWaitlistStudents() {
        return this.maxWaitlistStudents;
    }

    public int getNumOnRoster() {
        return this.numOnRoster;
    }

    public int getNumOnWaitlist() {
        return this.numOnWaitlist;
    }

    public boolean addStudent(Student student) {
        /*
        TODO:
        a student is eligible to add the course if:
        - they have paid tuition
        - they are not already enrolled on the roster or waitlist

        if a student is eligible to add:
        - if there is room on the roster, add the student to the roster
        - if the roster is full but there is room on the waitlist, add the student to the waitlist
        - if there is no room on the roster or waitlist, do not add the student

        return true or false based on whether the student is added or not
        - if a student is added to either the roster or the waitlist, the method should return true

        Change numOnRoster and numOnWaitlist accordingly
        */

        return true;
    }

    public boolean dropStudent(Student student){
        /*
        TODO:
        if the student is not on the roster or waitlist, the student cannot be dropped

        if the student is on the waitlist, remove the student from the waitlist

        if the student is on the roster, remove the student from the roster
        - since there is now one more space in the class, if the waitlist is not empty,
        take the first student off the waitlist and add them to the roster; then remove that student from the waitlist

        return true or false based on whether the student is removed (from either the roster or the waitlist) or not

        Change numOnRoster and numOnWaitlist accordingly
         */
        return true;
    }

    public String toString() {
        /*
        TODO:
         - Add roster of enrolled students
         - students on the waitlist
         - null handling
        */

        return this.name + "\n" +
                this.numOnRoster + " enrolled (maximum allowed " +
                this.maxRosterStudents + ")\n" +
                this.numOnWaitlist + " on waitlist (maximum allowed " +
                this.maxWaitlistStudents + ")\n ";

    }


}
