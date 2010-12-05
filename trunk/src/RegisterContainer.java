package organizer;
import java.util.Vector;

public class RegisterContainer{
	private Vector<Register> m_container = new Vector<Register>();
	
	public void add(final Register register){
		m_container.add(register);
	}

	public final int size(){
		return m_container.size();
	}
	
	public final Register get(){
		return m_container.lastElement();
	}
}
