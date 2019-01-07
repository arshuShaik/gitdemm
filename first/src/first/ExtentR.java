package first;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentR {
	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter repoter=new ExtentHtmlReporter("C:\\Users\\kalpana\\Desktop\\Ass for Selenium\\Scenaraios\\reports\\report1.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(repoter);
		ExtentTest logg=extent.createTest("main");
		logg.log(Status.INFO,"test is running");
		logg.log(Status.ERROR,"Errr");
		logg.log(Status.WARNING, "waring message");
		logg.addScreenCaptureFromPath("C:\\Users\\kalpana\\Desktop\\Ass for Selenium\\Scenaraios\\screenshots\\ss.png");
		logg.fail("failed due to some reason", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\kalpana\\Desktop\\Ass for Selenium\\Scenaraios\\screenshots\\ss.png").build());
		logg.log(Status.FAIL, "test failed");
		extent.flush();
		
		
		System.out.println("done success");

	}

}


