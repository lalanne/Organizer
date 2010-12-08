package organizer;
import java.util.TreeMap;

public class RegisterContainer{
	private TreeMap<Task, Register> m_container = new TreeMap<Task, Register>();
	
	public void add(final Task task, final Register register){
		Register rg = m_container.get(task);
		if(rg == null){
			m_container.put(task, register);
		}
		else{
			Register newReg = new Register(register.hours() + rg.hours());
			m_container.put(task, newReg);
		}
	}

	public final int size(){
		return m_container.size();
	}
	
	public final int hours(final Task task){
		Register rg = m_container.get(task);
		if(rg == null){
			return 0;
		}
		else{
			return m_container.get(task).hours();
		}
	}
}
