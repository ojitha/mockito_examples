package au.com.blogspot.ojitha.mockito.exmaples.firstexample.entrolment;

import au.com.blogspot.ojitha.mockito.exmaples.firstexample.domain.Person;
import au.com.blogspot.ojitha.mockito.exmaples.firstexample.registration.Registration;

public class Enrol {
	private Registration registration ;
	public boolean studentEnrol(Person student){
		return registration.register(student);
	}
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	
}
