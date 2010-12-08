package organizer;
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
		StringToDate stringToDate = new StringToDate(Organizer.now("dd.MM.yy"));
		stringToDate.execute();
		Date date = new Date(stringToDate.day(), stringToDate.month(), stringToDate.year());
		System.out.println("Date: "+date);
		
		RegisterContainer registerContainer = new RegisterContainer();
		TaskContainer taskContainer = new TaskContainer();
		
		
		while(true){
			System.out.println("insert a new task: ");
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			Task task = new Task(stdin.readLine());
			taskContainer.add(date, task);

			System.out.println("insert numbers of hours worked: ");
			BufferedReader stdin1 = new BufferedReader(new InputStreamReader(System.in));
		    int hours = Integer.parseInt(stdin1.readLine());
			Register register = new Register(hours);
			registerContainer.add(task, register);
			
			System.out.println("value:" + registerContainer.hours(task));
			System.out.println("task:" + taskContainer.name(date));
		}	
	}
}
