import static org.junit.Assert.*;
import org.junit.Test;


public class RegisterContainerTest{
	@Test
	public void addOneRegisterAndGettingTheSameRegisterFromContainer(){
		int hours = 4;
		Date today = new Date(5, 12, 2010);
		Register register = new Register(hours);
		RegisterContainer registerContainer = new RegisterContainer();
		
		registerContainer.add(today, register);
		
		assertEquals(4, registerContainer.hours(today));
    }
	
	@Test
	public void addTwoRegisterWithTheSameDateAndGetTheSumOfTheHours(){
		int hours = 4;
		Date today = new Date(5, 12, 2010);
		Register register1 = new Register(hours);
		Register register2 = new Register(hours);
		RegisterContainer registerContainer = new RegisterContainer();
		
		registerContainer.add(today, register1);
		registerContainer.add(today, register2);
		
		assertEquals(8, registerContainer.hours(today));
    }
}
