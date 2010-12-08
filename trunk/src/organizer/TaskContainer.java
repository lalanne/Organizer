package organizer;

import java.util.TreeMap;

public class TaskContainer {
	private TreeMap<Date, Task> m_container = new TreeMap<Date, Task>();
	
	public void add(final Date date, final Task task){
		m_container.put(date, task);
	} 
	
	public final int size(){
		return m_container.size();
	}
	
	public String name(final Date date){
		return m_container.get(date).name();
	}

}
