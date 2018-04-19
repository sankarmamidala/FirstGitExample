
public class Test 
{
	
	public enum Day
	{
		SUNDAY,MONDAY,TUESDAY,WENDSDAY,FRIDAY,SATURDAY;
	}
	Day day;

	public Test(Day day)
	{
		this.day=day;
	}
	
	public void days()
	{
		
		switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
                
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
                     
        case SATURDAY: case SUNDAY:
            System.out.println("Weekends are best.");
            break;
                    
        default:
            System.out.println("Midweek days are so-so.");
            break;
    }
}
	
	public static void main(String[] args) 
	{
		
		Test firstDay = new Test(Day.MONDAY);
        firstDay.days();
        Test thirdDay = new Test(Day.WENDSDAY);
        thirdDay.days();
        Test fifthDay = new Test(Day.FRIDAY);
        fifthDay.days();
        Test sixthDay = new Test(Day.SATURDAY);
        sixthDay.days();
        Test seventhDay = new Test(Day.SUNDAY);
        seventhDay.days();
    }
		
}