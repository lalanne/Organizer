import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringToDateTest {
	@Test
	public void getDateFromString(){
		String date = "22.12.10";
		StringToDate stringToDate = new StringToDate(date);
		
		stringToDate.execute();
		
		assertEquals(22, stringToDate.day());
		assertEquals(12, stringToDate.month());
		assertEquals(10, stringToDate.year());
    }

}
