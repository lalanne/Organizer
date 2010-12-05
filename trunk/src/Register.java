package organizer;

public class Register{
	private int m_hours = 0;
	private Date m_date = new Date();
	
	public Register(final int hours, final Date date){
		m_hours = hours;
		m_date = date;
	}
	
	public final int hours(){
		return m_hours;
	}
	
	public final Date date(){
		return m_date;
	}

}
