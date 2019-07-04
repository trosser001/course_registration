public class Student {

	private String name, id;
	private boolean tuitionPaid;

	public Student(String name, String id, boolean tuitionPaid) {
		this.name = name;
		this.id = id;
		this.tuitionPaid = tuitionPaid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public boolean isTuitionPaid() {
		return tuitionPaid;
	}

	public void setTuitionPaid(boolean tuitionPaid) {
		this.tuitionPaid = tuitionPaid;
	}

	@Override
	public String toString() {
		return name + " (" + id + ")";
	}
	/*
	// YOU CAN IGNORE THIS METHOD FOR NOW! WE'LL LEARN ABOUT THIS SOON!
	// THIS METHOD IS ONLY NEEDED IF YOU ARE COMPLETING THE EXTRA CREDIT!
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student other = (Student) obj;
			return this.id.equalsIgnoreCase(other.id);
		} else {
			return false;
		}
	}
	*/

	
}
