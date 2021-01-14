package calendar.generator.logic;

public class CalendarSeeder {

	
// 4 weeks have 28 days
// 5 weeks have 35 days
	
// 1 one month will have or either 4 weeks or either 5 weeks
// 454 445 544 are 3 months sequence, one quarters  always have 35 + 28 + 28 = 91 days
// Semesters always have 182 days
// One year always have 364 days
	
// One year has 52 weeks, or 53 weeks
	
// Because years have 365 days, there are 1 day or 2 remaining each year
// 1 day in regular years, 2 days in leap years.

	
// Every years that remaining days reaches 7 days, there's a need to add an extra week (53 weeks year)
	
// Leap years are those who can be divided by 4 and 400 but not by 100.
	
	                              // 35 +28 +28  +35  +28  +28  +35  +28  +28  +35  +28  +28  +7(To handle 53 weeks years)
	private final int[] type_544 = { 35, 63, 91, 126, 154, 182, 217, 245, 273, 308, 336, 364, 371 };
	
	private final int[] type_454 = { 28, 63, 91, 119, 154, 182, 210, 245, 273, 301, 226, 364, 371 };
	
	private final int[] type_445 = { 28, 56, 91, 119, 147, 182, 210, 238, 273, 301, 329, 364, 371 };
	

	// Calendar internal vars
	// Buckets are majored in way that they can handle 53 weeks scenario
	
	// Days
	private LoopCounter dow = new LoopCounter(1,7);		// DOW => Day of Week
	private LoopCounter	dom	= new LoopCounter(1,31);	// DOM => Day of Month
	private LoopCounter doy = new LoopCounter(1,371);	// DOY => Day of Year
	private LoopCounter doq = new LoopCounter(1,98);	// DOQ => Day of Quarter
	private LoopCounter dos = new LoopCounter(1,189);	// DOS => Day of Semester
	private LoopCounter d14	= new LoopCounter(1,14);	// D14 => Day of 14 days block
	private LoopCounter d28 = new LoopCounter(1,28);	// D28 => Day of 28 days block
	
	// Weeks
	private LoopCounter woy = new LoopCounter(1,53);	// WOY => Week of Year
	private LoopCounter wom = new LoopCounter(1,5);		// WOM => Week of Month
	private LoopCounter woq = new LoopCounter(1,15);	// WOQ => Week of Quarter
	private LoopCounter wos = new LoopCounter(1,27);	// WOS => Week of Semester
	
	// Months
	private LoopCounter moy = new LoopCounter(1,12);	// MOY => Month of year
	private LoopCounter moq = new LoopCounter(1,3);		// MOQ => Month of quarter
	private LoopCounter mos = new LoopCounter(1,6);		// MOS => Month of semester
	
	//Quarters 
	private LoopCounter qoy = new LoopCounter(1,4);		// QOY => Quarter of year
	private LoopCounter qos = new LoopCounter(1,2);		// QOS => Quarter of semester
	
	//Semester
	private LoopCounter soy = new LoopCounter(1,2);		// SOY => Semester of year
	
	
	
}
