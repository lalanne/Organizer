package organizer;

public class Date {
	private int m_day = -1;
	private int m_month = -1;
	private int m_year = -1;
	
	public Date(){
		
	}
	
	public Date(final int day, final int month, final int year){
		m_day = day;
		m_month = month;
		m_year = year;
	}
	
	public final int day(){
		return m_day;
	}
	
	public final int month(){
		return m_month;
	}
	
	public final int year(){
		return m_year;
	}

}
