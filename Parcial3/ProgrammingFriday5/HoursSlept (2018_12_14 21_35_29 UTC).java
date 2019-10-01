import java.util.Scanner;
/*
	Alfredo Palacios Olagaray
	26 October 2018
	Program that tells you how many hours you slept.
*/
public class HoursSlept{
	public static void main(String[]args){

		//constants
		final int WEEK=7;
		final int BIWEEK=15;
		final int MONTH=30;

		//local variables
		Scanner kb=new Scanner(System.in);
		int time=0;
		int hours=0, counter=0, sum=0, average=0;
		String response="";

		//process
		System.out.print("I'll tell you the average of hours you slept.");
		System.out.println(" Tell me if you want it weekly, biweekly or monthly.");
		response=kb.next();
		if(response.equalsIgnoreCase("weekly")){
			time=WEEK;
		}
		else if(response.equalsIgnoreCase("biweekly")){
			time=BIWEEK;
		}
		else if(response.equalsIgnoreCase("monthly")){
			time=MONTH;
		}
		int[]hoursSleptDay=new int[time];

		System.out.println("Enter the number of hours you slept per day.");
		for(counter=0; counter<hoursSleptDay.length; counter++){
			System.out.println("For day number " + (counter+1) + " the amount of hours is:");
			hours=kb.nextInt();
			hoursSleptDay[counter]=hours;
		}
		for(counter=0; counter<hoursSleptDay.length; counter++){
			System.out.println("In day " + (counter+1) + " you slept " + hoursSleptDay[counter]);
		}
		for(counter=0; counter<hoursSleptDay.length; counter++){
			sum+=hoursSleptDay[counter];
		}
		average=sum/hoursSleptDay.length;
		System.out.println("The average is: " + average);

	}//end main
}//end everything