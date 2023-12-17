package utils;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LibDriver {		
		public static WebDriver driver;
		public WebDriver getDriver() {
			if (this.driver==null) {
				this.driver = createDriver();
			}
			return this.driver;
		}
		private WebDriver createDriver() {
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().deleteAllCookies();
			return driver;
			
		}

		public String GetCurrentTime() {
			
			String cTime = new SimpleDateFormat("yyyyMMdd_HHmm").format(new Date());
			return cTime;
		}


	}



