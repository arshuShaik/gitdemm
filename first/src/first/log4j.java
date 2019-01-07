package first;

import java.util.logging.Logger;

public class log4j {
	public static void main(String[] args) {
		System.out.println("start");
		Logger logs=Logger.getLogger("Log4j");
		logs.info("working fine");
		logs.info("fine");
		System.out.println("running");
	}

}

