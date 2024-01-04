
    /** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int sundayCounter=0;//count sundays on the first's
	
	public static void main(String args[]) {
	    int debugDaysCounter = 0;  
        int yearToPrint = Integer.parseInt(args[0]);
	 	while (year <= yearToPrint) {
            if (year == yearToPrint) {
               if (dayOfWeek == 1) {
				System.out.println(dayOfMonth+"/"+month+"/"+year + " Sunday"); 
			    }
			    else{
				System.out.println(dayOfMonth+"/"+month+"/"+year); 
			    }
	 			 
            }
				
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (false) { 
	 			break;
	 		}
        }
	 	//System.out.println("During this year , "+sundayCounter+" Sundays fell on the first day of the month");
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		
			if(nDaysInMonth(month, year) == 31){
				if(dayOfMonth<31)
				{
					dayOfMonth++;
				}
				else{
					dayOfMonth = 1;
					month++;
					if (month==13) {
						month=1;
					}
				}
			}
			else if(nDaysInMonth(month, year) == 30){
				if(dayOfMonth<30)
				{
					dayOfMonth++;
				}
				else{
					dayOfMonth = 1;
					month++;
				}
			}
			else if(nDaysInMonth(month, year) == 29){
				if(dayOfMonth<29)
				{
					dayOfMonth++;
				}
				else{
					dayOfMonth = 1;
					month++;
				}
			}
				else if(nDaysInMonth(month, year) == 28){
				if(dayOfMonth<28)
				{
					dayOfMonth++;
				}
				else{
					dayOfMonth = 1;
					month++;
				}
			}
			

			if(month == 1 && dayOfMonth==1)
			{
				year++;
			}
			
			if (dayOfWeek%7 == 0) {
				dayOfWeek = 1;
				if(dayOfMonth == 1){
						sundayCounter++;
				}
			}
			else{
				dayOfWeek++;
			}
		}	 
    // Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    boolean leapOrNot = ((year % 400) == 0);
		leapOrNot = leapOrNot || (((year % 4) == 0) && ((year % 100) != 0));
		return leapOrNot;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		int numOfDays = 0;
		if(isLeapYear(year))//it is a leap year
		{
			switch (month) {
				case 1: numOfDays = 31;
						break;
				case 2: numOfDays = 29;
						break;
				case 3: numOfDays = 31;
						break;
				case 4: numOfDays = 30;
						break;
				case 5: numOfDays = 31;
						break;
				case 6: numOfDays = 30;
						break;
				case 7: numOfDays = 31;
						break;
				case 8: numOfDays = 31;
						break;
				case 9: numOfDays = 30;
						break;
				case 10: numOfDays = 31;
						break;
				case 11: numOfDays = 30;
						break;
				case 12: numOfDays = 31;
						break;
				default: numOfDays = -1;
					break;
			}
		}
		else
		{
			switch (month) {
				case 1: numOfDays = 31;
						break;
				case 2: numOfDays = 28;
						break;
				case 3: numOfDays = 31;
						break;
				case 4: numOfDays = 30;
						break;
				case 5: numOfDays = 31;
						break;
				case 6: numOfDays = 30;
						break;
				case 7: numOfDays = 31;
						break;
				case 8: numOfDays = 31;
						break;
				case 9: numOfDays = 30;
						break;
				case 10: numOfDays = 31;
						break;
				case 11: numOfDays = 30;
						break;
				case 12: numOfDays = 31;
						break;
				default: numOfDays = -1;
					break;
			}
		}
		return numOfDays;
	}
}


