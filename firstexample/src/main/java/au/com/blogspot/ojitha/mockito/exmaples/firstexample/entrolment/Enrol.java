package au.com.blogspot.ojitha.mockito.exmaples.firstexample.entrolment;

import au.com.blogspot.ojitha.mockito.exmaples.firstexample.domain.Student;
import au.com.blogspot.ojitha.mockito.exmaples.firstexample.registration.Registration;

public class Enrol {
	private Registration registration ;
	public void studentEnrol(Student student){
		registration.register(student);
	}
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	
	
}
