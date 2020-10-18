
/* denotes my birthday and then finds the specific month, year, weekday, and day of the month it is, prints it out, then finds those that are true of 10,000 days later */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarInfo {
	GregorianCalendar myBirthday = new GregorianCalendar(2004, Calendar.FEBRUARY, 21);
	public void output() {
		int dayOfMonth = myBirthday.get(Calendar.DAY_OF_MONTH); 
		int month = myBirthday.get(Calendar.MONTH);            
		int year = myBirthday.get(Calendar.YEAR);               
		int weekday = myBirthday.get(Calendar.DAY_OF_WEEK); 
		System.out.println(dayOfMonth +","+ month +","+ year +","+ weekday);
		myBirthday.add(Calendar.DAY_OF_MONTH, 10000);
		dayOfMonth = myBirthday.get(Calendar.DAY_OF_MONTH); 
		month = myBirthday.get(Calendar.MONTH);            
		year = myBirthday.get(Calendar.YEAR);               
		weekday = myBirthday.get(Calendar.DAY_OF_WEEK); 
		System.out.println(dayOfMonth +","+ month +","+ year +","+ weekday);
	}
}
