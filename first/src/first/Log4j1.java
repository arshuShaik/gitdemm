package first;

import org.apache.log4j.Logger;
import org.bson.diagnostics.Loggers;



public class Log4j1 {

	public static void main(String[] args) {
		System.out.println("working");
		Logger logs=Logger.getLogger("Log4j1");
		logs.info("log4j fine");
		System.out.println("log4j working fine");

	}

}
