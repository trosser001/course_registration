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

     	int rosterSize = Arrays.asList(roster).size();
    	int waitlistSize = Arrays.asList(waitlist).size();
    	
    	if (!student.isTuitionPaid()) { 
    		return false; 
    	} //end if 

    	if (rosterSize == 0) {
    		for (Student onRoster: roster) { 
    			if (onRoster.getID().equalsIgnoreCase(student.getID())) {
    				return false; 
    			} //end ifi
    		} //end for each
    	} //end if

    	if (waitlistSize == 0) { 
    		for (Student onWaitlist: waitlist) {
    			if (onWaitlist.getID().equalsIgnoreCase(student.getID())) {
    				return false;
    			} //end if
    		} //end for each
    	} //end if

    	if (numOnRoster < maxRosterStudents) {
       		roster[numOnRoster] = student; 
    		this.numOnRoster++;return true; 
    	} else if (numOnWaitlist < maxWaitlistStudents) {
    		waitlist[numOnWaitlist] = student; 
    		this.numOnWaitlist++; 
    		return true; 
    	} else {
    		return false; 
 	} //end if
} // end addStudent method  
  


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
