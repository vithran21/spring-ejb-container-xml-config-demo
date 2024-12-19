package applicationcontext.dependencyinjection;

public class Jspiders {

	Course course;

	public Jspiders(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Jspiders [course=" + course + "]";
	}

}
