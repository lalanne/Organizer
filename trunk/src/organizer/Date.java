package organizer;


public class Date implements Comparable<Date>{
	private int m_day = -1;
	private int m_month = -1;
	private int m_year = -1;
	
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
	
	public String toString(){
		return ""+m_day+"."+m_month+"."+m_year+"";
	}
	
	public int compareTo(Date other){
		if(other.year() < this.year()){
			return -1;
		}
		else if(other.year() > this.year()){
			return 1;
		}
		else{
			if(other.month() < this.month()){
				return -1;
			}
			else if(other.month() > this.month()){
				return 1;
			}
			else{
				if(other.day() < this.day()){
					return -1;
				}
				else if(other.month() > other.month()){
					return 1;
				}
				else{
					return 0;
				}
			}
		}
	}
}
