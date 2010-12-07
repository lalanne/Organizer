import java.io.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Organizer {
	
	public static String now(String dateFormat) {
	    Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	    return sdf.format(cal.getTime());

	  }
	
	public static void main(String[] args) throws IOException{
		RegisterContainer registerContainer = new RegisterContainer();
		StringToDate stringToDate = new StringToDate(Organizer.now("dd.MM.yy"));
		stringToDate.execute();
		Date date = new Date(stringToDate.day(), stringToDate.month(), stringToDate.year());
		System.out.println("Date: "+date);
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.println("insert numbers of hours worked: ");
		    
		    int hours = Integer.parseInt(stdin.readLine());
			Register register = new Register(hours);
			
			registerContainer.add(date, register);
			
			System.out.println("value:" + registerContainer.hours(date));
		}	
	}
}
