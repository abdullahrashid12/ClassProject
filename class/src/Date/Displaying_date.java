package Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class Displaying_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalTime time= LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime= LocalDateTime.now();
		System.out.println(datetime);

	}

}
