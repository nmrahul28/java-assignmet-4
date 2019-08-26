import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Kyc_formdate {
	public Date signUpDate, currentDate;
	public String stringStartDate, stringEndDate;
	Date startDate, endDate;
	public void rangeOfKycDates(String inputSignUpDate, String inputCurrentDate) {
		try {
			//Date formatter object and converting string to date and date to string.
			SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
			signUpDate = dateFormatter.parse(inputSignUpDate);
			currentDate= dateFormatter.parse(inputCurrentDate);
			
			if(signUpDate.after(currentDate)) {
				System.out.println("No range");
			}
			else {
				startDate = signUpDate;
				//setting sign up year to start date
				startDate.setYear(currentDate.getYear());
				//creating calendar object
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(startDate);
				calendar.add(Calendar.DATE, -30);
				startDate=calendar.getTime();
				calendar.add(Calendar.DATE, 60);
				endDate=calendar.getTime();
				if(endDate.after(currentDate)) {
					endDate=currentDate;
				}
			}
			//changing date object to string
			stringStartDate=dateFormatter.format(startDate);
			stringEndDate=dateFormatter.format(endDate);
			System.out.print(stringStartDate);
			System.out.print(" ");
			System.out.println(stringEndDate);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
