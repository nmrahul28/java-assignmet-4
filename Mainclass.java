public class Mainclass {

	public static void main(String[] args) {
		Kyc_formdate kyc =new Kyc_formdate();
		kyc.rangeOfKycDates("16-07-1998", "27-06-2017");
		kyc.rangeOfKycDates("04-02-2016", "04-04-2017");
		kyc.rangeOfKycDates("04-05-2017", "04-04-2017");
		kyc.rangeOfKycDates("04-04-2015", "04-04-2016");
		kyc.rangeOfKycDates("04-04-2015", "15-03-2016");
	}

}
