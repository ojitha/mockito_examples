package au.com.blogspot.ojitha.mockito.exmaples.firstexample.entrolment;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import au.com.blogspot.ojitha.mockito.exmaples.firstexample.domain.Person;
import au.com.blogspot.ojitha.mockito.exmaples.firstexample.domain.Student;
import au.com.blogspot.ojitha.mockito.exmaples.firstexample.registration.Registration;

public class TestEnrolment {

	@Mock Registration registration;
	Enrol enrol;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		enrol = new Enrol();
		enrol.setRegistration(registration);
	}
	
	@Test
	public void testStudentEnrol() {
		Student student = new Student();
		student.setFirstName("Oj");
		student.setLastName("Hewa");
		when(registration.register(isA(Person.class))).thenReturn(true);
		
		//Assert.assertTrue(enrol.studentEnrol(student));
		enrol.studentEnrol(student);
		verify(registration).register(student);

		
	
	}

}
