
package javaapplication1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ali
 */

public class TimeZoneConversion{
 
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a ");
	public static void main(String[] args) {
		
	//Getting Source timezone Id
	ZoneId sourceTimeZone = ZoneId.of("Asia/Kolkata"); 
	//Getting Target timezone Id
        ZoneId destinationTimeZone = ZoneId.of("Asia/Riyadh");
        
        //Current DateTime time
        LocalDateTime todayDateTime = LocalDateTime.now();
         
        //Zoned date time at source timezone
        ZonedDateTime currentISTZonedDateTime = todayDateTime.atZone(sourceTimeZone);      
         
        //Zoned date time at target timezone
        ZonedDateTime currentBSTZonedDateTime = currentISTZonedDateTime.withZoneSameInstant(destinationTimeZone);
         
        
        System.out.println("Time in Kolkata::");
        System.out.println(dateTimeFormatter.format(currentISTZonedDateTime));
        System.out.println("Time in Riyadh::");
        System.out.println(dateTimeFormatter.format(currentBSTZonedDateTime));
	}
}