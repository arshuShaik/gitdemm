package first;

//import com.gargoylesoftware.htmlunit.WebConsole.Logger;

public class log4j {
public static void main(String[] args) {
	System.out.println("working");
	java.util.logging.Logger logs = java.util.logging.Logger.getLogger("Log4j");
	logs.info("Log4j fine");
	System.out.println("log4j working");
}
	
	
}
