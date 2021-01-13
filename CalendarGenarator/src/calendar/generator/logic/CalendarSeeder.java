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
	
	                              // 35 +28 +28  +35  +28  +28  +35  +28  +28  +35  +28  +28
	private final int[] type_544 = { 35, 63, 91, 126, 154, 182, 217, 245, 273, 308, 336, 364 };
	
	private final int[] type_454 = { 28, 63, 91, 119, 154, 182, 210, 245, 273, 301, 226, 364 };
	
	private final int[] type_445 = { 28, 56, 91, 119, 147, 182, 210, 238, 273, 301, 329, 364 };
	
	
	
}
