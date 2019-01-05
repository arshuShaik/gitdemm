package first;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("C:\\Users\\Disha\\git\\Automation1\\report\\firstreport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest test=extent.createTest("main");//mathod name
		test.log(Status.INFO, "test is running");
		test.log(Status.ERROR, "error due to some reason");
		test.log(Status.WARNING, "some warrning msg");
		test.addScreenCaptureFromPath("C:\\Users\\Disha\\git\\Automation1\\screenshot\\img.png");
		test.fail("failed", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Disha\\git\\Automation1\\screenshot\\img.png").build());
	    test.log(Status.FAIL, "testfailed");
		extent.flush();
		System.out.println("done");

	}

}
