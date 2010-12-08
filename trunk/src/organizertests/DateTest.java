package organizertests;
import static org.junit.Assert.*;

import org.junit.Test;
import organizer.Date;


public class DateTest{
	@Test
	public void transformDateToString(){
		Date date = new Date(2, 3, 10);
		assertEquals("2.3.10", date.toString());
	}
}
