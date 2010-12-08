package organizertests;
import static org.junit.Assert.*;
import organizer.*;

import org.junit.Test;
import organizer.Date;
import organizer.Register;
import organizer.RegisterContainer;


public class RegisterContainerTest{
	@Test
	public void add1RegisterAndGettingTheSameRegisterFromContainer(){
		int hours = 4;
		Task task = new Task("test task");
		Register register = new Register(hours);
		RegisterContainer registerContainer = new RegisterContainer();
		
		registerContainer.add(task, register);
		
		assertEquals(4, registerContainer.hours(task));
    }
	
	@Test
	public void add2RegisterWithTheSameDateAndGetTheSumOfTheHours(){
		int hours = 4;
		Task task = new Task("test task");
		Register register1 = new Register(hours);
		Register register2 = new Register(hours);
		RegisterContainer registerContainer = new RegisterContainer();
		
		registerContainer.add(task, register1);
		registerContainer.add(task, register2);
		
		assertEquals(8, registerContainer.hours(task));
    }
	
	@Test
	public void add3RegistersWithTheSameDateAndGetTheSumOfTheHours(){
		int hours = 4;
		int hours1 = 5;
		Task task = new Task("test task");
		Register register1 = new Register(hours);
		Register register2 = new Register(hours);
		Register register3 = new Register(hours1);
		RegisterContainer registerContainer = new RegisterContainer();
		
		registerContainer.add(task, register1);
		registerContainer.add(task, register2);
		registerContainer.add(task, register3);
		
		assertEquals(13, registerContainer.hours(task));
    }
	
	@Test
	public void addRegistersWith2DifferentDates(){
		int hours = 4;
		int hours1 = 5;
		Task task = new Task("test task");
		Task task1 = new Task("test task 1");
		Register register1 = new Register(hours);
		Register register2 = new Register(hours);
		Register register3 = new Register(hours1);
		RegisterContainer registerContainer = new RegisterContainer();
		
		registerContainer.add(task, register1);
		registerContainer.add(task, register2);
		registerContainer.add(task, register3);
		registerContainer.add(task1, register2);
		registerContainer.add(task1, register3);
		
		assertEquals(13, registerContainer.hours(task));
		assertEquals(9, registerContainer.hours(task1));
    }
	
	@Test
	public void addRegistersWith3DifferentDates(){
		int hours = 4;
		int hours1 = 5;
		Task task = new Task("test task");
		Task task1 = new Task("test task 1");
		Task task2 = new Task("test task 2");
		Register register1 = new Register(hours);
		Register register2 = new Register(hours);
		Register register3 = new Register(hours1);
		RegisterContainer registerContainer = new RegisterContainer();
		
		registerContainer.add(task, register1);
		registerContainer.add(task, register2);
		registerContainer.add(task, register3);
		registerContainer.add(task1, register2);
		registerContainer.add(task1, register3);
		registerContainer.add(task2, register3);
		registerContainer.add(task2, register3);
		
		assertEquals(13, registerContainer.hours(task));
		assertEquals(9, registerContainer.hours(task1));
		assertEquals(10, registerContainer.hours(task2));
    }
}
