package Cars;


	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class AudiTest {
		
		@Test//(groups = "smoke")//(Group we have to mention for group execution.)
		public void launch() {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get("https://www.audi.in/in/web/en.html");
	    Reporter.log("Audi Launched Successful", true);
	    
	  //  driver.quit();
		}
	}


