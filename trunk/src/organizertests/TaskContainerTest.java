package organizertests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import organizer.*;

public class TaskContainerTest {
	@Test
	public void add1Task(){
		
		Task task = new Task("test task");
		Date today = new Date(8, 12, 2010);
		TaskContainer taskContainer = new TaskContainer();
		taskContainer.add(today, task);
		
		assertEquals(1, taskContainer.size());
		assertEquals("test task", taskContainer.name(today));
    }

}
