package organizer;

public class StringToDate {
	private String m_date = "not_assigned";
	private int m_day = -1;
	private int m_month = -1;
	private int m_year = -1;
	
	public StringToDate(String date){
		m_date = date;
	}
	
	public void execute(){
		m_day = Integer.parseInt(m_date.substring(0,2));
		m_month = Integer.parseInt(m_date.substring(3,5));
		m_year = Integer.parseInt(m_date.substring(6,8));
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
