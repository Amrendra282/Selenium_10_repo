package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
 @Test
 public void launch() {
	 Reporter.log("Sample Test class get executed", true);
	 Reporter.log("Modified in GitHub", true);
 }
}
