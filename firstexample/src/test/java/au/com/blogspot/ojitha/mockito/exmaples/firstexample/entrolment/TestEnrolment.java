package au.com.blogspot.ojitha.mockito.exmaples.firstexample.entrolment;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.Times;

import static org.mockito.Mockito.*;
import au.com.blogspot.ojitha.mockito.exmaples.firstexample.domain.Parent;
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
		
		Parent parent = new Parent();

		parent.setStudents(new Student[]{student});
		
		when(registration.register(isA(Student.class))).thenReturn(true);
		when(registration.register(isA(Parent.class))).thenReturn(false);
		
		//only students can be registered, but not their parents.
		Assert.assertTrue(enrol.studentEnrol(student));
		Assert.assertFalse(enrol.studentEnrol(parent));

		verify(registration, new Times(2)).register(isA(Person.class));
	
	}

}
