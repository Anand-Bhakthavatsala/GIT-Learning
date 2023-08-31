package ITCMaven3.ITCMaven3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SpiceJetDemo {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void spicejet(String browser) throws InterruptedException
	{
		if (browser.equals("firefox"))
		{
			System.out.println("Opening firefox browser");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else if(browser.equals("edge"))
		{
			System.out.println("Edge browser opened");
			driver = new EdgeDriver();
		}
		else
			System.out.println("No browser matching");
		
		driver.get("https://book.spicejet.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
