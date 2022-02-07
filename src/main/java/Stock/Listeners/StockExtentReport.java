package Stock.Listeners;

import com.relevantcodes.extentreports.ExtentReports;

public class StockExtentReport {

		public static ExtentReports TestReports;

		public static ExtentReports CreateReport(String FileName) {
			TestReports = new ExtentReports(
					"/home/jordanliucmcraf/eclipse-workspace/Simplilearn-Assignment/Reports/"+FileName+".html");
			return TestReports;
		}
	}