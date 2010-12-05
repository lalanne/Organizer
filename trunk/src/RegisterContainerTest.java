package organizer;
import static org.junit.Assert.*;
import org.junit.Test;


public class RegisterContainerTest{
	 
	@Test
	public void addOneRegisterAndGettingTheSameRegisterFromContainer(){
		int hours = 4;
		Date today = new Date(5, 12, 2010);
		Register register = new Register(hours, today);
		RegisterContainer registerContainer = new RegisterContainer();
		
		registerContainer.add(register);
		
		assertEquals(4, registerContainer.get().hours());
		assertEquals(5, registerContainer.get().date().day());
		assertEquals(12, registerContainer.get().date().month());
		assertEquals(2010, registerContainer.get().date().year());
    }
}
