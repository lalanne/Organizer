package organizer;

public class Task implements Comparable<Task>{
	private String m_taskName = "empty task";
	
	public Task(final String name){
		m_taskName = name;
	}
	
	final String name(){
		return m_taskName;
	}

	public int compareTo(Task other){
		return this.name().compareTo(other.name());
	}
}
