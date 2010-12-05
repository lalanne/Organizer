import java.util.TreeMap;

public class RegisterContainer{
	private TreeMap<Date, Register> m_container = new TreeMap<Date, Register>();
	
	public void add(final Date date, final Register register){
		Register rg = m_container.get(date);
		if(rg == null){
			m_container.put(date, register);
		}
		else{
			Register newReg = new Register(register.hours() + rg.hours());
			m_container.put(date, newReg);
		}
	}

	public final int size(){
		return m_container.size();
	}
	
	public final int hours(final Date date){
		Register rg = m_container.get(date);
		if(rg == null){
			return 0;
		}
		else{
			return m_container.get(date).hours();
		}
	}
}
