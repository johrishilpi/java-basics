package java_programs;
import java.time.*;

public class Time_program {

	public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	System.out.println(date);
	LocalTime time=LocalTime.now();
	System.out.println(time);
	LocalDateTime datetime=LocalDateTime.now();
	System.out.println(datetime);
	LocalDate datefuture=LocalDate.now().plusDays(56);
	System.out.println(datefuture);
	LocalDateTime datetimefuture=LocalDateTime.now().plusDays(56).plusMinutes(120);
	System.out.println(datetimefuture);
	LocalDateTime datetimepast=LocalDateTime.now().minusDays(100);
	System.out.println(datetimepast);
	}

}
