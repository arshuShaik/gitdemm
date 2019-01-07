package first;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReport {

	public static void main(String[] args) throws IOException {

    ExtentHtmlReporter reporter = new ExtentHtmlReporter("E:\\JavaPrac\\reportJarsProj\\Report\\ashish.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	ExtentTest logg = extent.createTest("main");
	logg.log(Status.INFO, "test is running");
//	logg.log(Status.ERROR, "error");
	logg.log(Status.WARNING, "warr");
//	logg.log(Status.FAIL, "test failed");
	logg.addScreenCaptureFromPath("C:\\Users\\Ashish\\Desktop\\aa.png");
	
//	logg.fail("Failed", MediaEntityBuilder.createScreenCaptureFromPath(""));
	
	
	extent.flush();
	System.out.println("done");
	
	
	}

}
